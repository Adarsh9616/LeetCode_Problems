class Solution {
    public char findTheDifference(String s, String t) 
    {
        int ans=0;
        for(char c:s.toCharArray())
        {
            ans=ans^c;
        }
        for(char c:t.toCharArray())
        {
            ans=ans^c;
        }
        return (char)ans;
    }
}