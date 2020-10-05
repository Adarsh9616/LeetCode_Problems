class Solution {
    public int jump(int[] nums) 
    {
        int n=nums.length;
        int jump=0;
        int current=0;
        int farthest=0;
        for(int i=0;i<n-1;i++)
        {
            farthest=Math.max(farthest,i+nums[i]);
            if(current==i)
            {
                jump++;
                current=farthest;
                if(current>=n-1)
                {
                    break;
                }
            }
        }
        return jump;
        
    }
}