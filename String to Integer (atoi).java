class Solution {
    public int myAtoi(String s) 
    {
        
        s=s.trim();
        if(s.equals(""))
        {
            return 0;
        }
        int f=1;
        if(s.charAt(0)=='-')
        {
            f=-1;
            s=s.substring(1);
        }
        else if(s.charAt(0)=='+')
        {
            f=1;
            s=s.substring(1);
        }
        int i=0;
        long sum=0;
        while(i<s.length()&&Character.isDigit(s.charAt(i)))
        {
            int a=Integer.parseInt(s.charAt(i)+"");
            if (sum > (Integer.MAX_VALUE - a) / 10) return f == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            sum=sum*10+a;
            i++;
        }
        if(sum*f<=Integer.MIN_VALUE)
        {
            sum=Integer.MIN_VALUE;
        }
        else if(sum*f>=Integer.MAX_VALUE)
        {
            sum=Integer.MAX_VALUE;
        }
        else
        {
            sum=f*sum;
        }
        return (int)sum;
    }
}