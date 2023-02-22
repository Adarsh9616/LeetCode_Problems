class Solution {
   public int maximumCount(int[] nums) {
        int n = nums.length;
        int pos, neg;
        neg = lowerBinary(nums, 0);
        pos = n - lowerBinary(nums, 1);
        return Math.max(pos, neg);
    }

    private int lowerBinary(int[] nums, int tar){
        int left = 0, right = nums.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == tar){
                right = mid - 1;
            }
            else if(nums[mid] < tar){
                left = mid + 1;
            }
            else{
                right = mid -1;
            }
        }
        return left;
    }
}