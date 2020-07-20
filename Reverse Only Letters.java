class Solution 
{
    public String reverseOnlyLetters(String S) 
    {
      StringBuilder s=new StringBuilder("");
        int j=S.length()-1;
        for(char c:S.toCharArray())
        {
            if(Character.isLetter(c))
            {
                while(!Character.isLetter(S.charAt(j)))
                {
                    j--;
                }
                s.append(S.charAt(j--));
            }
            else
            {
                s.append(c);
            }
        }
        return s.toString();
    }
}