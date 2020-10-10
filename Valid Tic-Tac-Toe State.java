class Solution {
    public boolean validTicTacToe(String[] board) 
    {
        return solve(board);
    }
    public boolean solve(String ar[])
    {
        int countX=0;
        int countO=0;
        for(String s:ar)
        {
            for(char c:s.toCharArray())
            {
                if(c=='X')
                {
                    countX++;
                }
                if(c=='O')
                {
                    countO++;
                }
            }
        }
        if(countO>countX||countX-countO>1)
        {
            return false;
        }
        boolean allX=false;
        boolean allO=false;
        for(String s:ar)
        {
            if(s.equals("XXX"))
            {
                allX=true;
            }
            if(s.equals("OOO"))
            {
                allO=true;
            }
        }
        if(ar[0].charAt(0)=='X'&&ar[1].charAt(0)=='X'&&ar[2].charAt(0)=='X')
        {
            allX=true;
        }
        if(ar[0].charAt(1)=='X'&&ar[1].charAt(1)=='X'&&ar[2].charAt(1)=='X')
        {
            allX=true;
        }
        if(ar[0].charAt(2)=='X'&&ar[1].charAt(2)=='X'&&ar[2].charAt(2)=='X')
        {
            allX=true;
        }
        if(ar[0].charAt(0)=='O'&&ar[1].charAt(0)=='O'&&ar[2].charAt(0)=='O')
        {
            allO=true;
        }
        if(ar[0].charAt(1)=='O'&&ar[1].charAt(1)=='O'&&ar[2].charAt(1)=='O')
        {
            allO=true;
        }
        if(ar[0].charAt(2)=='O'&&ar[1].charAt(2)=='O'&&ar[2].charAt(2)=='O')
        {
            allO=true;
        }
        if(ar[0].charAt(0)=='X'&&ar[1].charAt(1)=='X'&&ar[2].charAt(2)=='X')
        {
            allX=true;
        }
        if(ar[0].charAt(2)=='X'&&ar[1].charAt(1)=='X'&&ar[2].charAt(0)=='X')
        {
            allX=true;
        }
        if(ar[0].charAt(0)=='O'&&ar[1].charAt(1)=='O'&&ar[2].charAt(2)=='O')
        {
            allO=true;
        }
        if(ar[0].charAt(2)=='O'&&ar[1].charAt(1)=='O'&&ar[2].charAt(0)=='O')
        {
            allO=true;
        }
        if(allX&&allO)
        {
            return false;
        }
        if(allX)
        {
            if(countX<=countO)
            {
                return false;
            }
        }
        if(allO)
        {
            if(countX!=countO)
            {
                return false;
            }
        }
        return true;
    }
}