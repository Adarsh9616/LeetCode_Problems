class Solution {
    public int largestSumAfterKNegations(int[] A, int K) 
    {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int i:A)
        {
            p.add(i);
        }
        while(K-->0)
        {
            p.add(-p.poll());
        }
        int sum=0;
        while(!p.isEmpty())
        {
            sum+=p.poll();
        }
        return sum;
        
    }
}