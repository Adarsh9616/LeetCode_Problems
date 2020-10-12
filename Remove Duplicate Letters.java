class Solution {
    public String removeDuplicateLetters(String s) 
    {
        int lastIndex[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            lastIndex[c-'a']=i;
        }
        Stack<Character> st=new Stack<>();
        boolean seen[]=new boolean[26];
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(seen[c-'a'])
            {
                continue;
            }
            while(!st.isEmpty()&& c<st.peek()&&i<lastIndex[st.peek()-'a'])
            {
                seen[st.pop()-'a']=false;
            }
            st.push(c);
            seen[c-'a']=true;
        }
        StringBuilder ans=new StringBuilder("");
        while(!st.isEmpty())
        {
            ans.append(st.pop());
        }
        return ans.reverse().toString();
        
    }
}