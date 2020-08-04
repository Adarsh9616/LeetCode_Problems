class Solution 
{
    public boolean isPowerOfFour(int num) 
    {
        double a=Math.log(num)/Math.log(4);
        long b=(long)a;
        double c=b;
        if(c==a)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}