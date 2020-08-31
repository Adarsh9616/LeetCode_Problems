class Solution {
    public int findPeakElement(int[] nums) 
    {
        int l=0;int u=nums.length-1;
        while(l<u)
        {
            int mid=(l+u)/2;
            if(nums[mid]>nums[mid+1])
            {
                u=mid;
            }
            else
            {
                l=mid+1;
            }
        }
        return l;
    }
}