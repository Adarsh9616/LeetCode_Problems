class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) 
    {
        int sum=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                sum+=grid[i][j];
            }
        }
        int top[]=new int[grid[0].length];
        int left[]=new int[grid.length];
        for(int i=0;i<grid.length;i++)
        {
            int max=-1;
            for(int j=0;j<grid[0].length;j++)
            {
                max=Math.max(grid[i][j],max);
            }
            left[i]=max;
        }
        for(int i=0;i<grid[0].length;i++)
        {
            int max=-1;
            for(int j=0;j<grid.length;j++)
            {
                max=Math.max(grid[j][i],max);
            }
            top[i]=max;
        }
        int newSum=0;
        for(int i=0;i<top.length;i++)
        {
            for(int j=0;j<left.length;j++)
            {
                newSum+=Math.min(top[i],left[j]);
            }
        }
        return newSum-sum;
    }
}