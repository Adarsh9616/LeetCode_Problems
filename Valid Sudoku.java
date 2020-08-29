class Solution {
    public boolean isValidSudoku(char[][] board) 
    {
        for(int i=0;i<9;i++)
        {
            HashSet<Character> set=new HashSet<>();
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.')
                {
                    if(set.contains(board[i][j]))
                        return false;
                    set.add(board[i][j]);
                }
            }
        }
        for(int i=0;i<9;i++)
        {
            HashSet<Character> set=new HashSet<>();
            for(int j=0;j<9;j++)
            {
                if(board[j][i]!='.')
                {
                    if(set.contains(board[j][i]))
                        return false;
                    set.add(board[j][i]);
                }
            }
        }
        for(int l=0;l<9;l+=3)
        {
            for(int k=0;k<9;k+=3)
            {
                HashSet<Character> set=new HashSet<>();
                for(int i=0+k;i<3+k;i++)
                {
                    
                    for(int j=0+l;j<3+l;j++)
                    {
                        if(board[i][j]!='.')
                        {
                             if(set.contains(board[i][j]))
                                return false;
                            set.add(board[i][j]);
                        }
                    }
                }
            }
        }
        return true;
        
    }
}