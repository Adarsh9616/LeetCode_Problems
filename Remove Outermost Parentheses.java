class Solution {
    public String removeOuterParentheses(String S)
    {
        char ca[]=S.toCharArray();
        StringBuilder s=new StringBuilder("");
        int outerCount=0;
        for(char c:ca)
        {
            if(c=='(')
            {
                outerCount++;
                if(outerCount>1)
                {
                    s.append("(");
                }
            }
            else
            {
                outerCount--;
                if(outerCount>0)
                {
                    s.append(")");
                }
            }
        }
        return String.valueOf(s);
    }
}