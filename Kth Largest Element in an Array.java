class Solution 
{
    public int findKthLargest(int[] nums, int k) 
    {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int i:nums)
        {
            p.add(i);
            while(p.size()>k)
            {
                p.remove();
            }
        }
        return p.remove();
    }
}