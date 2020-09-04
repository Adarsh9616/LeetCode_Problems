class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
        int ans[]={-1,-1};
        int i1=binarySearch(nums,target,true);
        if(i1==nums.length||nums[i1]!=target)
        {
            return ans;
        }
        int i2=binarySearch(nums,target,false)-1;
        return new int[]{i1,i2};
    }
    public int binarySearch(int nums[],int target,boolean left)
    {
        int l=0;
        int h=nums.length;
        while(l<h)
        {
            int mid=(l+h)/2;
            if(nums[mid]>target||(left&&nums[mid]==target))
            {
                h=mid;
            }
            else
            {
                l=mid+1;
            }
        }
        return l;
    }
}