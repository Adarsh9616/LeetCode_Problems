class Solution 
{
    public int findPairs(int[] nums, int k) 
    {
        int ans=0;
        Arrays.sort(nums);
        HashMap<Integer,Integer> m=new HashMap<>();
        Set<Integer> s=new HashSet<>();
        for(int i:nums)
        {
            if(m.containsKey(i)&&!s.contains(i))
            {
                ans++;
                s.add(i);
                
            }
            m.put(i+k,1);
        }
        return ans;
    }
}