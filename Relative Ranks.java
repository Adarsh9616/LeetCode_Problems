class Solution 
{
    public String[] findRelativeRanks(int[] nums) 
    {
        if(nums.length==0)
        {
            return new String[]{};
        }
        Map<Integer,Integer> m=new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++)
        {
            m.put(nums[i],i);
        }
        
        int rank=1;
        String ans[]=new String[nums.length];
        for(int i:m.values())
        {
            ans[i]=rank+"";
            if(rank==1)
            {
                ans[i]="Gold Medal";
            }
            else if(rank==2)
            {
                ans[i]="Silver Medal";
            }
            else if(rank==3)
            {
                ans[i]="Bronze Medal";
            }
            rank++;
        }
        return ans;
    }
}


