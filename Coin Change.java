class Solution {
    public int coinChange(int[] coins, int amount) 
    {
        if(amount<1)
        {
            return 0;
        }
        int dp[]=new int[amount+1];
        int ans=solve(coins,amount,dp);
        return ans;
    }
    public int solve(int c[],int a,int dp[])
    {
        if(a<0)
        {
            return -1;
        }
        if(a==0)
        {
            return 0;
        }
        if(dp[a]!=0)
        {
            return dp[a];
        }
        int min=Integer.MAX_VALUE;
        for(int i:c)
        {
            int res=solve(c,a-i,dp);
            if(res>=0&&res<min)
            {
                min=res+1;
            }
        }
        dp[a]=(min==Integer.MAX_VALUE)?-1:min;
        return dp[a];
    }
}