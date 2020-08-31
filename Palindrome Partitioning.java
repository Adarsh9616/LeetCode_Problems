class Solution 
{
    List<List<String>> ans;
    List<String> list;
    public List<List<String>> partition(String s) 
    {
        ans=new ArrayList<>();
        list=new ArrayList<>();
        solve(s,0);
        return ans;
    }
    public boolean isPalin(String s)
    {
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
            {
                return false;
            }
        }
        return true;
    }
    public void solve(String s,int l)
    {
        if(l==s.length())
        {
            ArrayList<String> temp=new ArrayList<>(list);
            ans.add(temp);
            return;
        }
        for(int i=l;i<s.length();i++)
        {
            if(isPalin(s.substring(l,i+1)))
            {
                list.add(s.substring(l,i+1));
                solve(s,i+1);
                list.remove(list.size()-1);
            }
        }
    }
}