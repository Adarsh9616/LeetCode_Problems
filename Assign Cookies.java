class Solution {
    public int findContentChildren(int[] g, int[] s) 
    {
        Arrays.sort(g);
        Arrays.sort(s);
        int a=g.length-1;
        int b=s.length-1;
        int ans=0;
        while(a>=0&&b>=0)
        {
            if(g[a]<=s[b])
            {
                ans++;
                b--;
            }
            a--;
        }
        return ans;
    }
}