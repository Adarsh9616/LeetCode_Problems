class Solution {
    public int countSubstrings(String S)
    {
        int n=S.length();
        int count=0;
        boolean dp[][]=new boolean[n][n];
        for(int g=0;g<n;g++)
        {
            for(int i=0,j=g;j<n;j++,i++)
            {
                if(g==0)
                {
                    dp[i][j]=true;
                }
                else if(g==1)
                {
                    dp[i][j]=S.charAt(i)==S.charAt(j);
                }
                else
                {
                    dp[i][j]=S.charAt(i)==S.charAt(j)&&dp[i+1][j-1]?true:false;
                }
                if(dp[i][j])
                {
                    count++;
                }
            }
            
        }
        return count;
    }
}