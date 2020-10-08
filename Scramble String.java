class Solution 
{
    Map<String,Boolean> map=new HashMap<>();
    public boolean isScramble(String s1, String s2)
    {
        if(s1.length()!=s2.length())
        {
            return false;
        }
        return solve(s1,s2);
    }
    public boolean solve(String A,String B)
    {
        if(A.equals(B))
        {
            return true;
        }
        if(A.length()<=1||B.length()<=1)
        {
            return false;
        }
        String key= A+" "+B;
        if(map.containsKey(key))
        {
            return map.get(key);
        }
        boolean flag=false;
        int n=A.length();
        for(int k=1;k<A.length();k++)
        {
            boolean swapCheck = solve(A.substring(0,k),B.substring(n-k)) && solve(A.substring(k),B.substring(0,n-k));
            
            boolean swapCheck2 = solve(A.substring(0,k),B.substring(0,k)) && solve(A.substring(k),B.substring(k));                                                                   
            if(swapCheck||swapCheck2)                                                                
            {
                flag=true;
                break;
            }
        }
        map.put(key,flag);
        return flag;
    }
}