class Solution 
{
    boolean isPalin(char a,char b)
    {
        if(a==b)
        {
            return true;
        }
        return false;
    }
    public String longestPalindrome(String s) 
    {
        int i=0;int j=0;
        int k=0;
        String ans="";
        int max=-1;
        while(i<s.length())
        {
            k=i;
            j=i;
            int templength=0;
            while(k>=0&&j<s.length()&&isPalin(s.charAt(k),s.charAt(j)))
            {
                templength=  j-k;         
                j++;
                k--;
            }
            
            if(templength>max)
            {
                max=templength;
                ans=s.substring(k+1,j);
            }
            k=i;
            j=i+1;
            templength=0;
            while(k>=0&&j<s.length()&&isPalin(s.charAt(k),s.charAt(j)))
            {
                templength=  j-k;         
                k--;
                j++;
            }
            if(templength>max)
            {
                max=templength;
                ans=s.substring(k+1,j);
            }
            if(j==s.length()&&k<=0)
            {
                break;
            }
            i++;
        }
        return ans;
    }
}