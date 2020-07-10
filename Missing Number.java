class Solution {
    public int missingNumber(int[] nums) 
    {
        int ans=(nums.length*(nums.length+1))/2;
        for(int i:nums)
        {
            ans-=i;
        }
        return ans;
        
    }
}