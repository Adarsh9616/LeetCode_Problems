class Solution 
{
    public boolean isVowel(char c)
    {
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
        {
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) 
    {
        char cr[]=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            while(i<j&&!isVowel(cr[i]))
            {
                //System.out.println(cr[i]);
                i++;
            }
            while(i<j&&!isVowel(cr[j]))
            {
                //System.out.println(cr[j]);
                j--;
            }
            char t=cr[j];
            cr[j]=cr[i];
            cr[i]=t;
            i++;
            j--;
        }
        return new String(cr);
        
    }
}