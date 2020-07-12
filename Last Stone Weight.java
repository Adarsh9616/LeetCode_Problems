class Solution 
{
    public int lastStoneWeight(int[] s) 
    {
        if(s.length==0)
        {
            return 0;
        }
        Queue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:s)
        {
            q.add(i);
        }
        while(q.size()>1)
        {
            q.offer(q.poll()-q.poll());
        }
        return q.poll();
    }
}