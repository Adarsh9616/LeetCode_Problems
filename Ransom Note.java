class Solution {
    public boolean canConstruct(String r, String m) 
    {
        int ar[]=new int[26];
        for(char c:m.toCharArray())
        {
            ar[c-'a']++;
        }
        for(char c:r.toCharArray())
        {
            ar[c-'a']--;
            if(ar[c-'a']<0)
            {
                return false;
            }
        }
        return true;
        
    }
}