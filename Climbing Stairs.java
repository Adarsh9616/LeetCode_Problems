class Solution 
{
    int ar[]=new int[50];
    public int climbStairs(int n) 
    {
        if(n==1)
        {
            ar[1]=1;
            return ar[1];
        }
        if(n==2)
        {
            ar[2]=2;
            return ar[2];
        }
        if(ar[n]==0)
        {
            ar[n]= climbStairs(n-1)+climbStairs(n-2);
        }
        return ar[n];
    }
}