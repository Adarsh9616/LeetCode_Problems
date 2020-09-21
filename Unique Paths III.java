class Solution 
{
    int rows;
    int cols;
    int ans=0;
    public void solve(int x,int y,int remain,int grid[][])
    {
        if(grid[x][y]==2&&remain==1)
        {
            ans+=1;
            return;
        }
        int temp=grid[x][y];
        grid[x][y]=-4;//anynegative nnumber to mark it visited inplace
        remain-=1;
        int rowoffset[]={0,0,1,-1};
        int coloffset[]={1,-1,0,0};
        for(int i=0;i<4;i++)
        {
            int newx=x+rowoffset[i];
            int newy=y+coloffset[i];
            if(newx<0||newx>=rows||newy<0||newy>=cols)
            {
                continue;
            }
            if(grid[newx][newy]<0)
            {
                continue;
            }
            solve(newx,newy,remain,grid);
        }
        grid[x][y]=temp;
    }
    public int uniquePathsIII(int[][] grid) 
    {
        rows=grid.length;
        cols=grid[0].length;
        int obs=0;
        int x=0;
        int y=0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(grid[i][j]>=0)
                {
                    obs++;
                }
                if(grid[i][j]==1)
                {
                    x=i;
                    y=j;
                }
            }
        }
        solve(x,y,obs,grid);
        return ans;
    }
}