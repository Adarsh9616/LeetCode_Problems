class Solution 
{
    int count=0;
    public int findTargetSumWays(int[] nums, int S) 
    {
        HashMap<String ,Integer> m=new HashMap<>();
        return solve(nums,S,0,0,m);
    }
    public int solve(int nums[],int sum,int i,int currentSum,HashMap<String,Integer> m)
    {
        
        if(currentSum==sum&&i==nums.length)
        {
            return 1;
        }
        if(i>=nums.length)
        {
            return 0;
        }
        String key=i+" "+currentSum;
        if(m.containsKey(key))
        {
            return m.get(key);
        }
        m.put(key,solve(nums,sum,i+1,currentSum+nums[i],m)+solve(nums,sum,i+1,currentSum-nums[i],m));
        return m.get(key);
    }
}