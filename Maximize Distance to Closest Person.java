class Solution
{
    public int maxDistToClosest(int[] s) 
    {
        int n=s.length;
        int k=0;
        int max=0;
        for(int i:s)
        {
            if(i==1)
            {
                max=Math.max(max,(k+1)/2);
                k=0;
            }
            else
            {
                k++;
            }
        }
        k=0;
        for(int i:s)
        {
            if(i==1)
            {
                max=Math.max(k,max);
                break;
            }
            k++;
            
        }
        k=0;
        for(int i=n-1;i>=0;i--)
        {
            if(s[i]==1)
            {
                max=Math.max(k,max);
                break;
            }
            k++;
        }
        return max;
    }
}