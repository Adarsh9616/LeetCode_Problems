class Solution {
    public String reformat(String s)
    {
        StringBuilder a=new StringBuilder("");
        StringBuilder b=new StringBuilder("");
        StringBuilder ans=new StringBuilder("");
        for(char c:s.toCharArray())
        {
            if(Character.isDigit(c))
            {
                a.append(""+c);
            }
            else
            {
                b.append(""+c);
            }
        }
        if(Math.abs(a.length()-b.length())>1)
        {
            return "";
        }
        if(b.length()>a.length())
        {
            StringBuilder temp=a;
            a=b;
            b=temp;
        }
        if(b.length()!=a.length())b.append(" ");
        for(int i=0;i<b.length();i++)
        {
            ans.append(a.charAt(i));
            ans.append(b.charAt(i));
        }
        return ans.toString().trim();
        
    }
}