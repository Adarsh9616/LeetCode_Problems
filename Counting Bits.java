class Solution {
    public int[] countBits(int num) 
    {
        if(num==0)
        {
            return new int[]{0};
        }
        int ar[]=new int[num+1];
        ar[0]=0;
        ar[1]=1;
        int half=(int)Math.pow(2,1);
        int full=(int)Math.pow(2,2);
        int ch=1;
        int cf=2;
        int mid=(half+full)/2;
        int addition=half/2;
        for(int i=2;i<num+1;i++)
        {
            if(i>=full)
            {
                ch++;
                cf++;
                half=(int)Math.pow(2,ch);
                full=(int)Math.pow(2,cf);
                mid=(half+full)/2;
                addition=half/2;
            }
            if(i<mid)
            {
                ar[i]=ar[i-addition];
            }
            else if(i>=mid&&i<full)
            {
                ar[i]=ar[i-addition]+1;
            }
        }
        return ar;
    }
}