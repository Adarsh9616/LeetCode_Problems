class Solution 
{
    public int numSquares(int n) 
    {
        int dp[]=new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        return solve(n,dp);
    }
    public int solve(int n,int dp[])
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        if(dp[n]!=Integer.MAX_VALUE)
        {
            return dp[n];
        }
        int min=Integer.MAX_VALUE;
        for(int l=1;l*l<=n;l++)
        {
            min=Math.min(min,solve(n-l*l,dp));
        }
        dp[n]=(min==Integer.MAX_VALUE)?Integer.MAX_VALUE:min+1;
        return dp[n];
    }
}