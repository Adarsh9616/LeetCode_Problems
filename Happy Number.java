class Solution 
{
    public boolean isHappy(int n) 
    {
        HashSet<Integer> ma=new HashSet<>();
        int sum=0;
        while(sum!=1)
        {
            sum=0;
            int m=n;
            while(m>0)
            {
                sum=sum+(int)Math.pow(m%10,2);
                m/=10;
            }
            if(ma.contains(sum))
            {
                return false;
            }
            n=sum;
            ma.add(sum);
        }
        return true;
    }
}