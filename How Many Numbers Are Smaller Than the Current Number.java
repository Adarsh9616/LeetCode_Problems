class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) 
    {
        int[] store = new int[101];
        for(int num : nums) {
            store[num]++;
        }
        for(int i = 1; i < 101; i++)
            store[i] += store[i-1];
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0)
                nums[i] = store[nums[i] - 1];
        }
        return nums;
    }
}