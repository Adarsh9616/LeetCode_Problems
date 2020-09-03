class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) 
    {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i:A)
        {
            for(int j:B)
            {
                int sum=i+j;
                m.put(sum,m.getOrDefault(sum,0)+1);
            }
        }
        int count=0;
        for(int i:C)
        {
            for(int j:D)
            {
                int sum=i+j;
                sum*=-1;
                if(m.containsKey(sum))
                    count+=m.get(sum);
            }
        }
        return count;
    }
}