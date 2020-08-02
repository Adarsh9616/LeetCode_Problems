class Solution 
{
    public int longestPalindrome(String s) 
    {
        int count[]=new int[128];
        for(char c:s.toCharArray())
        {
            count[c]++;
        }
        int ans=0;
        boolean b=false;
        for(int v:count)
        {
            ans=ans+(v/2)*2;
            if(v%2==1)
            {
                b=true;
            }
        }
        if(b)
        {
            return ans+1;
        }
        else
        {
            return ans;
        }
    }
}