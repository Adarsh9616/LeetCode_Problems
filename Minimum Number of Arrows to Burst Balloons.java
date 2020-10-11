class Solution {
    public int findMinArrowShots(int[][] points) 
    {
        if(points.length<2)
        {
            return points.length;
        }
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int end=points[0][1];
        int ans=0;
        for(int i[]:points)
        {
            if(i[0]>end)
            {
                end=i[1];
                ans++;
            }
        }
        return ans+1;
    }
}