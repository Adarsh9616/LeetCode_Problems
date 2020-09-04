class Solution {
    public int longestSubstring(String s, int k) 
    {
        if(s.length()<k||s.length()==0)
        {
            return 0;
        }
        int ar[]=new int[26];
        for(char c:s.toCharArray())
        {
            ar[c-'a']++;
        }
        for(int i=0;i<s.length();i++)
        {
            if(ar[s.charAt(i)-'a']>=k)
            {
                continue;
            }
            int j=i+1;
            while(j<s.length()&&ar[s.charAt(j)-'a']<k) 
                j++;
            int left=longestSubstring(s.substring(0,i),k);
            int right=longestSubstring(s.substring(j),k);
            return Math.max(left,right);
        }
        return s.length();
    }
}