class Solution {
    public boolean isUgly(int num) 
    {
        if(num==0)
        {
            return false;
        }
        int i=0;
        int ar[]=new int[]{2,3,5};
        while(num!=1)
        {
            if(i==3)
            {
                return false;
            }
            if(num%ar[i]!=0)
            {
                i++;
            }
            else
            {
                num/=ar[i];
            }
        }
        return true;
    }
}