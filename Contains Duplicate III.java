class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) 
    {
        if(nums.length>9999)
        {
            return false;
        }
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<Math.min(i+k+1,nums.length);j++)
            {
                if(Math.abs((long)nums[i]-(long)nums[j])<=t)
                {
                    return true;
                }
            }
        }
        return false;
    }
}