class Solution {
    public int kthSmallest(int[][] matrix, int k) 
    {
        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
        for(int i[]:matrix)
        {
            for(int j:i)
            {
                p.add(j);
                while(p.size()>k)
                {
                    p.remove();
                }
            }
        }
        return p.remove();
    }
}