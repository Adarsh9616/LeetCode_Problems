class Solution
{
    public int maxSubArray(int[] nums) 
    {
        int sumTillNow=nums[0];
        int maxSum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            sumTillNow=Math.max(sumTillNow+nums[i],nums[i]);
            maxSum=Math.max(maxSum,sumTillNow);
        }
        return maxSum;
    }
}