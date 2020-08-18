class Solution
{
    public int[] plusOne(int[] d) 
    {
        int carry=1;
        for(int i=d.length-1;i>=0;i--)
        {
            if(carry+d[i]>=10)
            {
                int k=(carry+d[i])%10;
                carry=(carry+d[i])/10;
                d[i]=k;
            }
            else
            {
                d[i]=carry+d[i];
                carry=0;
            }
        }
        if(carry!=0)
        {
            int ar[]=new int[d.length+1];
            ar[0]=carry;
            for(int i=1;i<ar.length;i++)
            {
                ar[i]=d[i-1];
            }
            return ar;
        }
        return d;
    }
}