class Solution {
    public boolean checkPossibility(int[] nums) 
    {
       int cnt = 0;                                                           
        for(int i = 1; i < nums.length && cnt<=1 ; i++){
            if(nums[i-1] > nums[i]){
                cnt++;
                if(i-2<0 || nums[i-2] <= nums[i])nums[i-1] = nums[i]; 
                else nums[i] = nums[i-1];                                
            }
        }
        return cnt<=1; 
    }
}