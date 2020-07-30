class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        Map<Integer,Integer> m=new HashMap<>();
        int j=0;
        for(int i:nums)
        {
            if(m.containsKey(target-i))
            {
                return new int[]{m.get(target-i),j};
            }
            m.put(i,j);
            j++;
        }
        return new int[]{};
    }
}