class Solution {
    public List<Integer> partitionLabels(String s) 
    {
        int last[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            last[s.charAt(i)-'a']=i;
        }
        List<Integer> l=new ArrayList<>();
        int end=-1;
        int start=0;
        for(int i=0;i<s.length();i++)
        {
            end=Math.max(end,last[s.charAt(i)-'a']);
            if(end==i)
            {
                l.add(end-start+1);
                start=i+1;
            }
        }
        return l;
    }
}