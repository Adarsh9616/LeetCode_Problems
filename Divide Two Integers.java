class Solution {
    public int divide(int dividend, int divisor) 
    {
        boolean isneg=(dividend<0)^(divisor<0)?true:false;
        long a=Math.abs((long)dividend);
        long b=Math.abs((long)divisor);
        long t=0;
        long q=0;
        for(int i=31;i>=0;i--)
        {
            if(t+(b<<i)<=a)
            {
                t+=(b<<i);
                q=q|(1L<<i);
            }
        }
        if (isneg && q > Integer.MAX_VALUE) 
        {
            return Integer.MIN_VALUE;
        } 
        else if (!isneg && q >= Integer.MAX_VALUE) 
        {
            return Integer.MAX_VALUE;
        }
        if(isneg)
        {
            return (int)-q;
        }
        else
        {
            return (int)q;
        }
    }
}