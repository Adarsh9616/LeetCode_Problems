class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        if(nums.length==0)
        {
            return new ArrayList<>();
        }
        Set<List<Integer>> set=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            int A=nums[i];
            int k=i+1;
            int l=nums.length-1;
            while(k<l)
            {
                List<Integer> lis=new ArrayList<>();
                int sum=nums[k]+nums[l];
                if(sum==-A)
                {
                    set.add(Arrays.asList(A,nums[k++],nums[l--]));
                }
                else if(sum>-A)
                {
                    l--;
                }
                else if(sum<-A)
                {
                    k++;
                }
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(List<Integer> i:set)
        {
            ans.add(i);
        }
        return ans;
    }
}