class Solution {
    public int countCharacters(String[] words, String chars) 
    {
        int ans=0;
        int c[]=new int[26];
        for(char cc:chars.toCharArray())
        {
            c[cc-'a']++;
        }
        for(String s:words)
        {
            int cs[]=new int[26];
            for(char cc:s.toCharArray())
            {
                cs[cc-'a']++;
            }
            int i;
            for(i=0;i<26;i++)
            {
                if(cs[i]>c[i])
                {
                    break;
                }
            }
            if(i==26)
            {
                ans=ans+s.length();
            }
        }
        return ans;
        
    }
}