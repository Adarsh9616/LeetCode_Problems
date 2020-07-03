class Solution {
    public int repeatedNTimes(int[] A) 
    {
        Set<Integer> s=new HashSet<>();
        for(int i:A)
        {
            if(s.contains(i))
            {
                return i;
            }
            s.add(i);
        }
        
        return -1;
    }
}