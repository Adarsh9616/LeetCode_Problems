class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) 
    {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<nums.length-3;i++)
        {
            for(int j=i+1;j<nums.length-2;j++)
            {
                int A=nums[i]+nums[j];
                int k=j+1;
                int l=nums.length-1;
                while(k<l)
                {
                    int sum=nums[k]+nums[l];
                    if(sum+A==target)
                    {
                        List<Integer> li=new ArrayList<>();
                        li.add(nums[i]);
                        li.add(nums[j]);
                        li.add(nums[k]);
                        li.add(nums[l]);
                        Collections.sort(li);
                        set.add(li);
                        k++;
                        l--;
                    }
                    else if(sum+A>target)
                    {
                        l--;
                    }
                    else if(sum+A<target)
                    {
                        k++;
                    }
                }
            }
        }
        for(List<Integer> i:set)
        {
            ans.add(i);
        }
        return ans;
    }
}