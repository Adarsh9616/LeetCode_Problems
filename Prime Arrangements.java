class Solution 
{
    public int numPrimeArrangements(int n) 
    {
        boolean ar[]=new boolean[n+2];
        int count=0;
        ar[0]=true;
        ar[1]=true;
        int mod=1000000007;
        long ans=1;
        int count1=0;
        for(int i=1;i<n+1;i++)
        {
            if(!ar[i])
            {
                count++;
                ans=ans*count%mod;
                for(int j=i*2;j<n+1;j=j+i)
                {
                    ar[j]=true;
                }
            }
            else
            {
                count1++;
                ans=ans*count1%mod;
                
            }
        }
        return (int)ans%mod;
    }
}