class Solution {
    public void gameOfLife(int[][] board) 
    {
        int m=board.length;
        int n=board[0].length;
        int ar[][]=new int[board.length][board[0].length];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int neighbour=countLive(board,i,j);
                if(board[i][j]==1 && neighbour<2)
                {
                    ar[i][j]=0;
                }
                else if(board[i][j]==1 && (neighbour==2 || neighbour==3))
                {
                    ar[i][j]=1;
                }
                 else if(board[i][j]==1 && neighbour>3)
                 {
                    ar[i][j]=0;
                 }
                 else if(board[i][j]==0 && neighbour==3)
                 {
                    ar[i][j]=1;
                 }
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]=ar[i][j];
            }
        }
    }
    public int countLive(int ar[][],int i,int j)
    {
        int count=0;
        int d[][]={{0,-1},{0,1},{1,0},{1,-1},{1,1},{-1,-1},{-1,1},{-1,0}};
        for(int dd[]:d)
        {
            int x=i+dd[0];
            int y=j+dd[1];
            if(x>=0 && y>=0 && x<ar.length && y<ar[0].length)
            {
                 count+=ar[x][y];
            }
        }
        return count;
    }
}