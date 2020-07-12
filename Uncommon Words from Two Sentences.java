class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        Set<String> ans=new HashSet<>();
        Map<String,Integer> m=new HashMap<>();
        String sa[]=A.split(" ");
        String sb[]=B.split(" ");
        for(String i:sa)
        {
            m.put(i,m.getOrDefault(i,0)+1);
        }
        for(String i:sb)
        {
            m.put(i,m.getOrDefault(i,0)+1);
        }
        for(String i:sa)
        {
            if(m.get(i)==1)
            {
                ans.add(i);
            }
        }
        for(String i:sb)
        {
            if(m.get(i)==1)
            {
                ans.add(i);
            }
        }
        String aa[]=new String[ans.size()];
        int k=0;
        for(String i:ans)
        {
            aa[k++]=i;
        }
            
        return aa;
    }
}