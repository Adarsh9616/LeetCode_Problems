class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        if(nums.length==1)
        {
            return 1;
        }
        int dp[]=new int[nums.length];
        int max=0;
        for(int i=1;i<nums.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[i]>nums[j]&&dp[i]<=dp[j])
                {
                    dp[i]=dp[j]+1;
                }
            }
            max=Math.max(dp[i],max);
        }
        return max+1;
    }
}