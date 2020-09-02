class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) 
    {
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(Math.abs((long)nums[i]-(long)nums[j])<=t&&Math.abs(i-j)<=k)
                {
                    return true;
                }
            }
        }
        return false;
    }
}