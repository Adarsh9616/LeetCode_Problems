class Solution {
    public int numIslands(char[][] grid) 
    {
        int count=0;
         for(int i=0;i<grid.length;i++)
         {
             for(int j=0;j<grid[0].length;j++)
             {
                 if(grid[i][j]=='1')
                 {
                     count++;
                     floodFill(grid,i,j);
                 }
             }
         }
        return count;
    }
    public void floodFill(char [][]grid,int x,int y)
    {
        if(x>grid.length-1||y>grid[0].length-1||x<0||y<0||grid[x][y]=='0')
        {
            return;
        }
        grid[x][y]='0';
        floodFill(grid,x+1,y);
        floodFill(grid,x-1,y);
        floodFill(grid,x,y+1);
        floodFill(grid,x,y-1);
    }
}