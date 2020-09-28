class Solution {
    public boolean canPartition(int[] nums) 
    {
        int sum=0;
        for(int i:nums)
        {
            sum+=i;
        }
        if(sum%2!=0)
        {
            return false;
        }
        sum=sum/2;
        boolean dp[][]=new boolean[nums.length+1][sum+1];
        for(int i=0;i<nums.length+1;i++)
        {
            dp[i][0]=true;
        }
        for(int i=1;i<nums.length+1;i++)
        {
            for(int j=0;j<sum+1;j++)
            {
                if(nums[i-1]<=j)
                {
                    dp[i][j]=dp[i-1][j-nums[i-1]]||dp[i-1][j];
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
            
        }
        return dp[nums.length][sum];
    }
}