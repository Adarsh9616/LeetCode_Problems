class Solution {
    public String removeDuplicates(String S) 
    {
        Stack<Character> s=new Stack<>();
        for(char c:S.toCharArray())
        {
            if(!s.isEmpty())
            {
                char x=s.peek();
                if(x==c)
                {
                    s.pop();
                }
                else
                {
                    s.push(c);
                }
            }
            else
            {
                s.push(c);
            }
        }
        StringBuffer ans=new StringBuffer("");
        for(char c:s)
        {
            ans.append(c);
        }
        return String.valueOf(ans);
    }
}