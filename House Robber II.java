class Solution {
    public int rob(int[] nums) 
    {
        if(nums.length==1)
        {
            return nums[0];
        }
        int m1=solve(nums,new Integer[nums.length+1],0,nums.length-2);
        int m2=solve(nums,new Integer[nums.length+1],1,nums.length-1);
        return Math.max(m1,m2);
    }
    public int solve(int nums[],Integer dp[],int i,int end)
    {
        if(i>end)
        {
            return 0;
        }
        if(dp[i]!=null)
        {
            return dp[i];
        }
        dp[i]=Math.max(nums[i]+solve(nums,dp,i+2,end),solve(nums,dp,i+1,end));
        return dp[i];
    }
}