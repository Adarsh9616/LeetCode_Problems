class Solution {
    public void wiggleSort(int[] nums)
    {
        int val[]=Arrays.copyOf(nums,nums.length);
        Arrays.sort(val);
        int ind=nums.length-1;
        for(int i=1;i<nums.length;i+=2)
        {
            nums[i]=val[ind--];
        }
        for(int i=0;i<nums.length;i+=2)
        {
            nums[i]=val[ind--];
        }
    }
}