class Solution 
{
    public int numRookCaptures(char[][] board)
    {
        int count=0;
        int x=-1,y=-1;
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]=='R')
                {
                    x=i;y=j;
                    break;
                }
            }
        }
        int l=y,r=y;
        while(r<board[0].length)
        {
            if(board[x][r]=='p')
            {
                count++;
                break;
            }
            else if(board[x][r]=='B')
            {
                break;
            }
            r++;
        }
        while(l>=0)
        {
            if(board[x][l]=='p')
            {
                count++;
                break;
            }
            else if(board[x][l]=='B')
            {
                break;
            }
            l--;
        }
        l=x;r=x;
        while(r<board.length)
        {
            if(board[r][y]=='p')
            {
                count++;
                break;
            }
            else if(board[r][y]=='B')
            {
                break;
            }
            r++;
        }
        while(l>=0)
        {
            if(board[l][y]=='p')
            {
                count++;
                break;
            }
            else if(board[l][y]=='B')
            {
                break;
            }
            l--;
        }
        return count;
    }
}