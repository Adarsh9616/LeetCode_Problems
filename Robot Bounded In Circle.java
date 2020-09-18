class Solution {
    public boolean isRobotBounded(String instructions)
    {
        int direction=0;
        int x=0;
        int y=0;
        for(char c:instructions.toCharArray())
        {
            
            if(c=='G')
            {
                switch(Math.abs(direction%4))
                {
                    case 0: y++;break;
                    case 1: x--;break;
                    case 2: y--;break;
                    case 3: x++;break;
                }
            }
            else if(c=='L')
            {
                direction++;
            }
            else
            {
                direction--;
            }
        }
        
        return (x==0&&y==0)|| Math.abs(direction%4)!=0;
    }
}