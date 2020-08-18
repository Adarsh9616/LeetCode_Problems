class Solution 
{
    public String licenseKeyFormatting(String S, int K) 
    {
        S = S.toUpperCase();
        StringBuffer sb = new StringBuffer();        
        int count=0;
        for(int i=S.length()-1; i>=0; i--)
        {
            if(S.charAt(i)!='-')
            {
                count++;
                sb.append(S.charAt(i));
                if(count == K)
                {
                    count = 0;
                    sb.append("-");
                }
            }
        }
        if(sb.length()>1)
            if(sb.charAt(sb.length()-1) == '-')
                sb.deleteCharAt(sb.length()-1);
        return sb.reverse().toString();
    }
}