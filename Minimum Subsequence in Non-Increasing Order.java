class Solution {
    public List<Integer> minSubsequence(int[] nums) 
    {
        Arrays.sort(nums);
        int sum1=0;
        int sum2=0;
        for(int i:nums)
        {
            sum1=sum1+i;
        }
        int i;
        for(i=nums.length-1;i>=0;i--)
        {
            sum2=sum2+nums[i];
            sum1=sum1-nums[i];
            if(sum2>sum1)
            {
                break;
            }
        }
        List<Integer> ans=new ArrayList<Integer>();
        for(int j=nums.length-1;j>=i;j--)
        {
            ans.add(nums[j]);
        }
        return ans;
            
    }
}