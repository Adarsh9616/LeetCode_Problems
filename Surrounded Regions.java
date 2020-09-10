class Solution {
    public void solve(char[][] board) 
    {
        if(board.length==0)
        {
            return;
        }
        for(int i=0;i<board.length;i++)
        {
            if(board[i][0]=='O')
                solve(board,i,0);
        }
        for(int i=0;i<board.length;i++)
        {
            if(board[i][board[0].length-1]=='O')
                solve(board,i,board[0].length-1);
        }
        for(int j=0;j<board[0].length;j++)
        {
            if(board[0][j]=='O')
                solve(board,0,j);
        }
        for(int j=0;j<board[0].length;j++)
        {
            if(board[board.length-1][j]=='O')
                solve(board,board.length-1,j);
        }
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]=='O')
                {
                    board[i][j]='X';
                }
                else if(board[i][j]=='#')
                {
                    board[i][j]='O';
                }
            }
        }
    }
    public void solve(char br[][],int x,int y)
    {
        if(x<0||y<0||x>=br.length||y>=br[0].length||br[x][y]!='O')
        {
            return;
        }
        br[x][y]='#';
        solve(br,x+1,y);
        solve(br,x,y+1);
        solve(br,x-1,y);
        solve(br,x,y-1);
    }
}