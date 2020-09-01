class Solution
{
    public int lengthOfLIS(int[] nums)
    {
        int dp[]=new int[nums.length];
        int maxLength=0;
        for(int i:nums)
        {
            int index=Arrays.binarySearch(dp,0,maxLength,i);
            if(index<0)
            {
                index=Math.abs(index+1);
            }
            dp[index]=i;
            if(index==maxLength)
            {
                maxLength++;
            }
        }
        //System.out.println(Arrays.toString(dp));
        return maxLength;
    }
}