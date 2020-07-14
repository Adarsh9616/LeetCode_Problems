class Solution 
{
    public int numIdenticalPairs(int[] nums) 
    {
        int ans=0;
        int ar[]=new int[101];
        for(int i:nums)
        {
            ar[i]++;
        }
        for(int i:ar)
        {
            if(i>1)
            {
                ans+=(i*(i-1)/2);
            }
        }
        return ans;
    }
}