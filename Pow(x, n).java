class Solution 
{
    public double myPow(double x, int n) 
    {
        if(n<0)
        {
            return neg( x, n);
        }
        else
        {
            return post(x,n);
        }
    }
    public double neg(double x,int n)
    {
        if(n==-1)
        {
            return 1/x;
        }
        double partial=neg(x,n/2);
        if((n&1)==0)
        {
            return partial*partial;
        }
        else
        {
            return 1/x*partial*partial;
        }
    }
    public double post(double x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        double partial=post(x,n/2);
        if((n&1)==0)
        {
            return partial*partial;
        }
        else
        {
            return x*partial*partial;
        }
    }
}