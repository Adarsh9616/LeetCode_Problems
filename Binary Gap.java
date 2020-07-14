class Solution {
    public int binaryGap(int N) 
    {
        int ar[]=new int[32];
        int t=0;
        int max=0;
        for(int i=0;i<32;i++)
        {
            if(((N>>i)&1)!=0)
            {
                ar[t++]=i;
            }
        }
        for(int i=0;i<t-1;i++)
        {
            max=Math.max(max,ar[i+1]-ar[i]);
        }
        return max;
    }
}