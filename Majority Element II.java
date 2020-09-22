class Solution 
{
    public List<Integer> majorityElement(int[] nums) 
    {
        int count1=0;
        int count2=0;
        Integer candidate1=null;
        Integer candidate2=null;
        for(int n:nums)
        {
            if(candidate1!=null&&candidate1==n)
            {
                count1++;
            }
            else if(candidate2!=null&&candidate2==n)
            {
                count2++;
            }
            else if(count1==0)
            {
                candidate1=n;
                count1++;
            }
            else if(count2==0)
            {
                candidate2=n;
                count2++;
            }
            else
            {
                count1--;
                count2--;
            }
        }
        List<Integer> ans=new ArrayList<>();
        count1=0;
        count2=0;
        for(int i:nums)
        {
            if (candidate1 != null && i == candidate1) count1++;
            if (candidate2 != null && i == candidate2) count2++;
        }
        int n=nums.length;
        if(count1>n/3)ans.add(candidate1);
        if(count2>n/3)ans.add(candidate2);
        return ans;
    }
}