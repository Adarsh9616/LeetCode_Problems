class Solution {
    public int findNumbers(int[] nums) 
    {
        int count=0;
        for(int i:nums)
        {
            String s=String.valueOf(i);
            if((s.length()&1)==0)
            {
                count++;
            }
        }
        return count;
        
    }
}