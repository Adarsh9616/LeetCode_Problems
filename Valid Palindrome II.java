class Solution 
{
    public boolean isPalindrome(String s,int l,int h)
    {
        while(l<h)
        {
            if(s.charAt(l)!=s.charAt(h))
            {
                return false;
            }
            l++;
            h--;
        }
        return true;
    }
    public boolean validPalindrome(String s) 
    {
        int l=0;
        int h=s.length()-1;
        while(l<h)
        {
            if(s.charAt(l)==s.charAt(h))
            {
                l++;
                h--;
            }
            else if(isPalindrome(s,l+1,h))
            {
                return true;
            }
            else if(isPalindrome(s,l,h-1))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}