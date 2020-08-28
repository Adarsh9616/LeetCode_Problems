class Solution {
    public boolean isPerfectSquare(int num) 
    {
        long l=1;
        long u=num;
        while(l<=u)
        {
            long m=(l+u)/2;
            if(m*m==num)
            {
                return true;
            }
            else if(m*m<num)
            {
                l=m+1;
            }
            else
            {
                u=m-1;
            }
        }
        return false;
    }
}