class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        if (k == nums.length) {
            return nums;
        }
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:nums)
        {
            m.put(i,m.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> p=new PriorityQueue<>((n1,n2) -> m.get(n1)-m.get(n2));
        for(int i:m.keySet())
        {
            p.add(i);
            if(p.size()>k)
            {
                p.poll();
            }
        }
        int ar[]=new int[k];
        for(int i=k-1;i>=0;--i)
        {
            ar[i]=p.poll();
        }
        return ar;
        
    }
}