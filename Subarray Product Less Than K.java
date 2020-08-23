class Solution 
{
    public int numSubarrayProductLessThanK(int[] nums, int k) 
    {
        int i=0;
        int j=0;
        int product=1;
        int ans=0;
        while(j<nums.length)
        {
            product*=nums[j++];
            while(i<nums.length&&product>=k)
            {
                product/=nums[i++];
            }
            if(i<j)
            ans=ans+(j-i);
        }
        return ans;
    }
}