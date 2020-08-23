class Solution {
    public boolean checkSubarraySum(int[] nums, int k) 
    {
        HashMap<Integer,Integer> m=new HashMap<>();
        boolean ans=false;
        int sum=0;
        m.put(0,0);
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            int rem=(k==0)?sum:sum%k;
            if(rem<0)
            {
                rem+=k;
            }
            if(m.containsKey(rem))
            {
                int j=m.get(rem);
                if(i+1-j>1)
                {
                    ans=true;
                    break;
                }
            }
            else m.put(rem,i+1);
        }
        return ans;
        
    }
}