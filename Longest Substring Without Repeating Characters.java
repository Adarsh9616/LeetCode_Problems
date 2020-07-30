class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int max=0;
        Set<Character> set=new HashSet<>();
        int j=0;
        int i=0;
        while(i<s.length()&&j<s.length())
        {
           if(set.contains(s.charAt(j)))
           {
               set.remove(s.charAt(i++));
           }
            else
            {
                set.add(s.charAt(j++));
            }
            max=Math.max(max,set.size());
        }
        return max;
    }
}