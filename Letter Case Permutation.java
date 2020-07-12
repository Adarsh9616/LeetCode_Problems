class Solution 
{
    List<String> ans=new ArrayList<>();
    public List<String> letterCasePermutation(String S) 
    {
        solve(S,0);
        return ans;
    }
    public void solve(String s, int i)
    {
        if(i==s.length())
        {
            ans.add(s);
            return;
        }
        char c=s.charAt(i);
        if(Character.isAlphabetic(c))
        {   StringBuilder str = new StringBuilder(s); 
            str.setCharAt(i, Character.toLowerCase(c)); 
            s=String.valueOf(str);  
            solve(s,i+1);
            str = new StringBuilder(s); 
            str.setCharAt(i, Character.toUpperCase(c)); 
            s=String.valueOf(str);
            solve(s,i+1);
        }
        else
        {
            solve(s,i+1);
        }
    }
}