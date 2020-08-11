class Solution 
{
    public int hIndex(int[] c) 
    {
        int ar[]=new int[c.length+1];
        for(int i=0;i<c.length;i++)
        {
            if(c[i]>c.length)
            {
                ar[c.length]++;
            }
            else
            {
                ar[c[i]]++;
            }
        }
        for(int i:ar)
        {
            System.out.println(i);
        }
        int count=0;
        for(int i=c.length;i>=0;i--)
        {
            count+=ar[i];
            if(count>=i)
            {
                return i;
            }
        }
        return 0;
    }
}