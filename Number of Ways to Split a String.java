class Solution {
    public int numWays(String s) 
    {
        long count=0;
        long n=s.length();
        long mod=1000000007;
        for(char c:s.toCharArray())
        {
            count+=(c-'0');
        }
        if(count%3!=0)
        {
            return 0;
        }
        if(count==0)
        {
            return (int)(((((n-1)%mod)*((n-2)%mod))/2)%mod);
        }
        long l=0;
        long way1=0;
        long way2=0;
        for(char c:s.toCharArray())
        {
            l+=(c-'0');
            if(l==count/3)
            {
                way1++;
            }
            if(l==(2*count)/3)
            {
                way2++;
            }
        }
        return (int)(((way1%mod)*(way2%mod))%mod);
    }
}