class Solution {
    public int maxProduct(int[] nums)
    {
        int l=nums.length;
        int b1=-1;
        int b2=-1;
        for(int i=0;i<l;i++)
        {
            if(b1<nums[i])
            {
                b2=b1;
                b1=nums[i];
            }
            else if(b2<nums[i])
            {
                b2=nums[i];
            }
        }
        return (b1-1)*(b2-1);
        
    }
}