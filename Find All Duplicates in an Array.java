class Solution {
    public List<Integer> findDuplicates(int[] nums) 
    {
        List<Integer> ans=new ArrayList<>();
        Set<Integer> s=new HashSet<>();
        int ar[]=new int[nums.length+1];
        for(int i:nums)
        {
            ar[i]++;
        }
        for(int i:nums)
        {
            if(ar[i]==2)
            {
                s.add(i);
            }
        }
        
        return new ArrayList<>(s);
    }
}