class Solution {
    public List<String> findRepeatedDnaSequences(String s) 
    {
        if(s.length()<10)
        {
            return new ArrayList<>();
        }
        List<String> ans=new ArrayList<>();
        Set<String> set=new HashSet<>();        Set<String> set1=new HashSet<>();
        StringBuilder st=new StringBuilder(s);
        for(int i=0;i<=s.length()-10;i++)
        {
            String k=s.substring(i,i+10);
            if(!set.contains(k))
            {
                set.add(k);
            }
            else
            {
                set1.add(k);
            }
        }
        return new ArrayList<>(set1);
    }
}