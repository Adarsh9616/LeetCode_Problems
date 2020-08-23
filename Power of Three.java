class Solution {
    public boolean isPowerOfThree(int n) 
    {
        double a=Math.log10(n)/Math.log10(3);
        int b=(int)a;
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