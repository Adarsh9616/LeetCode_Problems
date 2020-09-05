class Solution {
    public boolean wordBreak(String s, List<String> wordDict) 
    {
        boolean dp[]=new boolean[s.length()+1];
        dp[0]=true;
        for(int i=1;i<s.length()+1;i++)
        {
            boolean check=false;
            String str=s.substring(0,i);
            for(String a:wordDict)
            {
                if(str.endsWith(a))
                {
                    check=check||dp[i-a.length()];
                }
            }
            dp[i]=check;
        }
        return dp[s.length()];
    }
}