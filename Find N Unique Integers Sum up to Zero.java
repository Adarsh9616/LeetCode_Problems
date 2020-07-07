class Solution {
    public int[] sumZero(int n) 
    {
        int ar[]=new int[n];
        if((n&1)==0)
        {
            int j=0;
            for(int i=-n/2;i<=n/2;i++)
            {
                if(i==0)
                {
                    continue;
                }
                ar[j++]=i;
            }
        }
        else
        {
            int j=0;
            for(int i=-n/2;i<=n/2;i++)
            {
                ar[j++]=i;
            }
        }
        return ar;
        
    }
}