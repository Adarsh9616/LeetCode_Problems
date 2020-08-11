class Solution 
{
    public String countAndSay(int n) 
    {
        if(n==1)
        {
            return "1";
        }
        String s=countAndSay(n-1);
        StringBuilder ans=new StringBuilder();
        int j=0;
        int i=0;
        while(j<s.length())
        {
            while(j<s.length()&&s.charAt(i)==s.charAt(j))
            {
                j++;
            }
            ans.append(""+(j-i)+s.charAt(i));
            i=j;
        }
        return ans.toString();
    }
}