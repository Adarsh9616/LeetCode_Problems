class Solution 
{
    public List<List<Integer>> shiftGrid(int[][] g, int k) 
    {
        while(k-->0)
        {
            int prev=g[g.length-1][g[0].length-1];
            for(int i=0;i<g.length;i++)
            {
                for(int j=0;j<g[0].length;j++)
                {
                    int temp=g[i][j];
                    g[i][j]=prev;
                    prev=temp;
                }
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        
        for(int r[]:g)
        {
            List<Integer> l=new ArrayList<>();
            for(int i:r)
            {
                l.add(i);
            }
            ans.add(l);
        }
        return ans;
    }
}