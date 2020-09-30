class Solution {
    public int coinChange(int[] coins, int A) 
    {
        int n=coins.length;
        long dp[][]=new long[n+1][A+1];
        for(int j=0;j<=A;j++)
        {
            dp[0][j]=Integer.MAX_VALUE;
        }
        for(int j=0;j<=A;j++)
        {
            if(j%coins[0]==0)
            {
                dp[1][j]=j/coins[0];
            }
            else
            {
                dp[1][j]=Integer.MAX_VALUE;
            }
        }
        for(int i=2;i<=n;i++)
        {
            for(int j=1;j<=A;j++)
            {
                if(coins[i-1]<=j)
                {
                    dp[i][j]=Math.min(dp[i-1][j],1+dp[i][j-coins[i-1]]);
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][A]>=Integer.MAX_VALUE?-1:(int)dp[n][A];
    }
}