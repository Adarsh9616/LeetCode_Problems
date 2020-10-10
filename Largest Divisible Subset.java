class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums)
    {
        int n=nums.length;
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        if(n==1)
        {
            ans.add(nums[0]);
            return ans;
        }
        int dp[]=new int[n];
        for(int i=0;i<n;i++)
        {
            dp[i]=1;
        }
        int max=-1;
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                int a=Math.max(nums[i],nums[j]);
                int b=Math.min(nums[j],nums[i]);
                if(a%b==0&&dp[i]<=dp[j])
                {
                    dp[i]=dp[j]+1;
                }
            }
            max=Math.max(max,dp[i]);
        }
        int prev=1;
        System.out.println(Arrays.toString(dp));
        for(int i=n-1;i>=0;i--)
        {
            int a=Math.max(nums[i],prev);
            int b=Math.min(prev,nums[i]);
            if(dp[i]==max&&(a%b==0))
            {
                ans.add(nums[i]);
                max=max-1;
                prev=nums[i];
            }
        }
        return ans;
    }
}