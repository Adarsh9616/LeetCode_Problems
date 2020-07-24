class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int result = 0, sum = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                sum++;
            }
            if(nums[i] == 0) {
                result = Math.max(result, sum);
                sum = 0;
            }
        }
        result = Math.max(result, sum);
        return result;
        
    }
}