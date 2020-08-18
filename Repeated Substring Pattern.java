class Solution 
{
    public boolean repeatedSubstringPattern(String s)
    {
       int len = s.length();
       
        for(int i = len / 2; i >= 1; i--){
            if(len % i == 0)
            {
                String substring  = s.substring(0,i);
                int times = (len / i == 0) ? 1 : len / i;
                if(substring.repeat(times).equals(s))
                {
                    return true;
                }
                
            }
        }
        return false;
    }
}