class Solution {
    public void rotate(int[] nums, int k) 
    {
        k=k%nums.length;
        reverse(nums,nums.length-k);
        reverse(nums,nums.length);
        reverse(nums,k);
    }
    public void reverse(int nums[],int k)
    {
        for(int i=0;i<k/2;i++)
        {
            int temp=nums[i];
            nums[i]=nums[k-i-1];
            nums[k-i-1]=temp;
        }
    }
}