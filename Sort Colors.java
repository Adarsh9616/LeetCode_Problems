class Solution {
    public void sortColors(int[] nums) 
    {
        int ar[]=new int[3];
        for(int i:nums)
        {
            ar[i]++;
        }
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            while(ar[k]==0)
            {
                k++;
            }
            nums[i]=k;
            ar[k]--;
            
        }
    }
}