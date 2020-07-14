class Solution 
{
    int dp[][]=new int[34][34];
    public List<Integer> getRow(int rowIndex) 
    {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++)
        {
            ans.add(solve(rowIndex,i));
        }
        return ans;
                
    }
    public int solve(int i,int j)
    {
        if(j==0||j==i)
        {
            return 1;
        }
        if(dp[i][j]==0)
            dp[i][j]=solve(i-1,j-1)+solve(i-1,j);
        
        return dp[i][j]; 
    }
}