class Solution {
    public int longestPalindromeSubseq(String A) 
    {
        int n=A.length();
        String B=new StringBuilder(A).reverse().toString();
        int m=n;
        int dp[][]=new int[n+1][m+1];
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(A.charAt(i-1)==B.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
}