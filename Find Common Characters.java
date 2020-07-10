class Solution
{
    public List<String> commonChars(String[] A) 
    {
        int min[]=new int[26];
        for(int i=0;i<26;i++)
        {
            min[i]=101;
        }
        for(String s:A)
        {
            int count[]=new int[26];
            for(char c:s.toCharArray())
            {
                count[c-'a']++;
            }
            for(int i=0;i<26;i++)
            {
                min[i]=Math.min(min[i],count[i]);
            }
        }
        List<String> ss=new ArrayList<>();
        for(int i=0;i<26;i++)
        {
            while(min[i]>0)
            {
                ss.add(String.valueOf((char)('a'+i)));
                min[i]--;
            }
        }
        return ss;
    }
}