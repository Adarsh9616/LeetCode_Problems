class Solution {
    public boolean canThreePartsEqualSum(int[] A) 
    {
        int sum=0;
        for(int i:A)
        {
            sum+=i;
        }
        sum=sum/3;
        int temp=0;
        int c=0;
        for(int i=0;i<A.length;i++)
        {
            temp+=A[i];
            if(temp==sum)
            {
                temp=0;
                c++;
            }
        }
        if(temp==0&&c>=3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}