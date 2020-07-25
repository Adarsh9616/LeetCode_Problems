class Solution {
    public int firstUniqChar(String s)
    {
        int ar[]=new int[26];
        for(char c:s.toCharArray())
        {
            ar[c-'a']++;
        }
        int ans=Integer.MAX_VALUE;
        int j=0;
        for(int i:ar)
        {
            if(i==1)
            {
                int k=s.indexOf((char)('a'+j));
                ans=Math.min(ans,k);
            }
            j++;
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}