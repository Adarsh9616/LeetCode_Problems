class Solution 
{
    public int subarraysDivByK(int[] A, int K) 
    {
        HashMap<Integer,Integer> m=new HashMap<>();
        m.put(0,1);
        int sum=0;
        int count=0;
        for(int i:A)
        {
            sum+=i;
            int rem=sum%K;
            if(rem<0)
            {
                rem+=K;
            }
            if(m.containsKey(rem))
            {
                count+=m.get(rem);
            }
            m.put(rem,m.getOrDefault(rem,0)+1);
        }
        return count;
        
    }
}