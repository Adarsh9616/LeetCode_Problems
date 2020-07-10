class Solution 
{
    public int minStartValue(int[] nums) 
    {
        int min=0;
        int sum=0;
        for(int i:nums)
        {
            sum+=i;
            min=Math.min(min,sum);
        }
        return 1-min;
    }
}