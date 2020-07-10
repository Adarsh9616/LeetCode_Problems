class Solution {
    public int countLargestGroup(int n) 
    {
        int ar[]=new int[50];
        for(int i=1;i<=n;i++)
        {
            int sum=0;
            int l=i;
            while(l>0)
            {
                int k=l%10;
                sum=sum+k;
                l=l/10;
            }
            ar[sum]++;
        }
        int max=0;
        for(int i=1;i<50;i++)
        {
            max=Math.max(ar[i],max);
        }
        int count=0;
        for(int i=1;i<50;i++)
        {
            if(ar[i]==max)
            {
                count++;
            }
        }
        return count;
    }
}