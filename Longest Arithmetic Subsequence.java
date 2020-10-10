class Solution {
    public int longestArithSeqLength(int[] A) 
    {
        int n=A.length;
        if(n<=2)
        {
            return n;
        }
        int max=1;
        HashMap<Integer,Integer> dp[]=new HashMap[n];
        for(int i=0;i<n;i++)
        {
            dp[i]=new HashMap<>();
            int currentElement=A[i];
            HashMap<Integer,Integer> currentMap=dp[i];
            for(int j=0;j<i;j++)
            {
                int difference=currentElement-A[j];
                int newValue=dp[j].getOrDefault(difference,0)+1;
                currentMap.put(difference,newValue);
                max=Math.max(max,newValue);
            }
        }
        return max+1;
    }
}