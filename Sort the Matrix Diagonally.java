class Solution
{
    public int[][] diagonalSort(int[][] mat)
    {
        int n=mat.length;
        int m=mat[0].length;
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int diff=i-j;
                if(!map.containsKey(diff))
                {
                    map.put(diff,new ArrayList<>());
                    
                }
                List<Integer> a=map.get(diff);
                a.add(mat[i][j]);
            }
        }
        for(int i:map.keySet())
        {
            Collections.sort(map.get(i));
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int diff=i-j;
                mat[i][j]=map.get(diff).get(0);
                map.get(diff).remove(0);
            }
        }
        return mat;
    }
}