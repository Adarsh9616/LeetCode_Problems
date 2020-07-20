class Solution
{
    public int[] numSmallerByFrequency(String[] queries, String[] words) 
    {
        int li[]=new int[words.length];
        int j=0;
        int ans[]=new int[queries.length];
        for(String s:words)
        {
            int count[]=new int[26];
            for(char c:s.toCharArray())
            {
                count[c-'a']++;
            }
            int k=-1;
            for(int i:count)
            {
                if(i>0)
                {
                    k=i;
                    break;
                }
            }
            li[j++]=k;
        }
        Arrays.sort(li);
        int m=0;
        for(String s:queries)
        {
            j=0;
            int count[]=new int[26];
            for(char c:s.toCharArray())
            {
                count[c-'a']++;
            }
            int k=-1;
            for(int i:count)
            {
                if(i>0)
                {
                    k=i;
                    break;
                }
            }
            int an=0;
            while(j<li.length&&k>=li[j])
            {
                j++;
            }
            ans[m++]=li.length-j;
            
        }
        return ans;
    }
}