class Solution 
{
    public int thirdMax(int[] nums) 
    {
        
        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
        Set<Integer> s=new HashSet<>();
        for(int i:nums)
        {
            if(s.contains(i))
            {
                continue;
            }
            p.add(i);
            s.add(i);
        }
        if(s.size()<3)
        {
            return p.poll();
        }
        p.poll();
        p.poll();
        return p.poll();
    }
}