class Solution {
    public int findLHS(int[] nums) 
    {
        Arrays.sort(nums);
        int max=0;
        for(int i=1;i<nums.length;i++)
        {
            int a=nums[i-1];
            int b=nums[i];
            if(b-a==1)
            {
                int l=i-1;
                int r=i;
                while(l>=0&&nums[l]==a)
                {
                    l--;
                }
                while(r<nums.length&&nums[r]==b)
                {
                    r++;
                }
                if(r-l-1>max)
                {
                    max=r-l-1;
                }
            }
            
        }
        return max;
    }
}