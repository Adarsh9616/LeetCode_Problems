class Solution {
    public String restoreString(String s, int[] indices) 
    {
        char ans[]=new char[s.length()];
        char cc[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            ans[indices[i]]=cc[i];
        }
        return new String(ans);
    }
}