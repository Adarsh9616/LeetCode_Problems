class Solution 
{
    private boolean visited[][];
    public boolean exist(char[][] board, String word) 
    {
        visited=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==word.charAt(0)&&solve(board,0,word,i,j))
                {
                    return true;
                }
            }
        }
        return false;
    }
    private boolean solve(char br[][],int idx,String s,int x,int y)
    {
        if(idx==s.length())
        {
            return true;
        }
        if(x<0||y<0||x>=br.length||y>=br[0].length||br[x][y]!=s.charAt(idx)||visited[x][y])
        {
            
            return false;
        }
        
        visited[x][y]=true;
        
        if(solve(br,idx+1,s,x-1,y)||
           solve(br,idx+1,s,x,y-1)||
           solve(br,idx+1,s,x,y+1)||
           solve(br,idx+1,s,x+1,y))
        {
            return true;
        }
        
        visited[x][y]=false;
        return false;
    }
}