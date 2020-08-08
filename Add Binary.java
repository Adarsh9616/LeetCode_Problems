class Solution {
    public String addBinary(String a, String b) 
    {
        int c=0;
        StringBuilder s=new StringBuilder("");
        for(int i=a.length()-1,j=b.length()-1;i>=0||j>=0;i--,j--)
        {
            int n=0;
            int m=0;
            char add='0';
            if(i>=0)
            {
                n=a.charAt(i)-48;
            }
            if(j>=0)
            {
                m=b.charAt(j)-48;
            }
            if(n+m+c==0)
            {
                s.append("0");
                c=0;
            }
            else if(n+m+c==1)
            {
                s.append("1");
                c=0;
            }
            else if(n+m+c==2)
            {
                s.append("0");
                c=1;
            }
            else if(n+m+c==3)
            {
                s.append("1");
                c=1;
            }
        }
        if(c==1)
        {
            s.append("1");
        }
        return s.reverse().toString();
            
    }
}