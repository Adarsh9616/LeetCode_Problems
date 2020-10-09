class Solution {
    public int findNumberOfLIS(int[] nums) 
    {
        int ans=0;
        int n=nums.length;
        if(n==1)
        {
            return 1;
        }
        int dp[]=new int[n];
        int count[]=new int[n];
        for(int i=0;i<n;i++)
        {
            dp[i]=1;
            count[i]=1;
        }
        int max=0;
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[i]>nums[j]&&dp[j]>=dp[i])
                {
                    dp[i]=dp[j]+1;
                    count[i]=count[j];
                }
                else if(dp[j]+1==dp[i])
                {
                    count[i]+=count[j];
                }
            }
            if(dp[i]>max)
            {
                max=dp[i];
            }
        }
        System.out.println(Arrays.toString(count));
        for(int i=0;i<n;i++)
        {
            if(dp[i]==max)
            {
                ans+=count[i];
            }
        }
        
        return ans;
    }
}