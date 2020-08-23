class Solution {
    public String thousandSeparator(int n) 
    {
        if(n==0)
        {
            return "0";
        }
        StringBuilder s=new StringBuilder();
        int k=0;
        while(n>0)
        {
            if(k==3)
            {
                s.append(".");
                k=0;
            }
            s.append(""+n%10);
            n/=10;
            k++;
        }
        return s.reverse().toString();
        
    }
}