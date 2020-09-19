class Solution 
{
    public boolean equal(int ar1[],int ar2[])
    {
        for(int i=0;i<ar1.length;i++)
        {
            if(ar1[i]!=ar2[i])
            {
                return false;
            }
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) 
    {
        if(s.length()<p.length())
        {
            return new ArrayList<>();
        }
        int start=0;
        int end=p.length();
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<p.length();i++)
        {
            freq1[s.charAt(i)-'a']++;
            freq2[p.charAt(i)-'a']++;
        }
        if(equal(freq1,freq2))
        {
            ans.add(0);
        }
        while(end<s.length())
        {
            freq1[s.charAt(start)-'a']--;
            freq1[s.charAt(end)-'a']++;
            if(equal(freq1,freq2))
            {
                ans.add(start+1);
            }
            start++;
            end++;
        }
        return ans;
    }
}