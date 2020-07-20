class Solution
{
    public void moveZeroes(int[] nums)
    {
        int liz=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[liz++]=nums[i];
            }
        }
        for(int i=liz;i<nums.length;i++)
        {
            nums[i]=0;
        }
    }
}