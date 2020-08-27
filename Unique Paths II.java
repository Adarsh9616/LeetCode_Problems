class Solution 
{
    public int uniquePathsWithObstacles(int[][] ob) 
    {    
        if(ob[0][0]==1)
        {
            return 0;
        }
        if(ob.length==1&&ob[0].length==1)
        {
            return 1;
        }
        int m=ob.length;
        int n=ob[0].length;
        int dp[][]=new int[m][n];
        
        dp[0][0]=1;
        for(int i=1;i<m;i++)
        {
            if(ob[i][0]==1)
            {
                dp[i][0]=0;
            }
            else if(dp[i-1][0]==1)
            {
                dp[i][0]=1;
            }
        }
        for(int i=1;i<n;i++)
        {
            if(ob[0][i]==1)
            {
                dp[0][i]=0;
            }
            else if(dp[0][i-1]==1)
            {
                dp[0][i]=1;
            }
        }
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(ob[i][j]==1)
                {
                    dp[i][j]=0;
                }
                else
                {
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        // for(int i=0;i<m;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     {
        //         System.out.print(dp[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        return dp[m-1][n-1];
    }
}