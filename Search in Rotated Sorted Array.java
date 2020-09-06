class Solution {
    public int search(int[] nums, int target) 
    {
        int l=0;
        int u=nums.length-1;
        while(l<=u)
        {
            int mid=(l+u)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[l]<=nums[mid])
            {
                if(target>=nums[l]&&target<nums[mid])
                {
                    u=mid-1;
                }
                else
                {
                    l=mid+1;
                }
            }
            else 
            {
                if(target<=nums[u]&&target>nums[mid])
                {
                    l=mid+1;
                }
                else 
                {
                    u=mid-1;
                }
            }
        }
        return -1;
    }
}
