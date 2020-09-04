class Solution {
    public boolean increasingTriplet(int[] nums) 
    {   
        if(nums.length<3)
        {
            return false;
        }
        int a=Integer.MAX_VALUE;
        int b=Integer.MAX_VALUE;
        int c=Integer.MAX_VALUE;
        for(int i:nums)
        {
            if(i<a)
            {
                a=i;
            }
            else if(a<i&&i<b)
            {
                b=i;
            }
            else if(i>a&&i>b&&i<c)
            {
                return true;
            }
        }
        return false;
    }
}