class KthLargest 
{
    PriorityQueue<Integer> q=new PriorityQueue<>();
    int K;
    public KthLargest(int k, int[] nums) 
    {
        K=k;
        for(int i:nums)
        {
            add(i);
        }
    }
    
    public int add(int val) 
    {
        q.add(val);
        if(q.size()>K)
        {
            q.poll();
        }
        return q.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */