class Solution 
{
    public int numberOfBoomerangs(int[][] points) 
    {
     int n = points.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            Map<Integer, Integer> pointsByDist = new HashMap<>();
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    continue;
                }
                int dist = findDist(points[i], points[j]);
                pointsByDist.put(dist, pointsByDist.getOrDefault(dist, 0) + 1);
            }
            for (Integer key : pointsByDist.keySet()) {
                int count = pointsByDist.get(key);
                ans += (count * (count - 1));
            }
        }
        return ans;
    }

    private int findDist(int[] pnt1, int[] pnt2) {
        return (pnt1[0] - pnt2[0]) * (pnt1[0] - pnt2[0]) + (pnt1[1] - pnt2[1]) * (pnt1[1] - pnt2[1]);
    }
}