class Solution {
    public int climbStairs(int n) 
    {
        int ans=0;
        int k=0;
        int k1=1;
        for(int i=0;i<n;i++)
        {
            ans=k+k1;
            k=k1;
            k1=ans;
        }
        return ans;
    }
}