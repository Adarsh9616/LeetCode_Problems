class Solution {
    public String mostCommonWord(String paragraph, String[] banned) 
    {   
        paragraph=paragraph.toLowerCase();
        Set<String> s=new HashSet<>();
        Map<String,Integer> m=new HashMap<>();
        String ar[]=paragraph.split("[\\s!?',;. ]");
        for(String a:ar)
        {
            String x=a;
            String y="";
            for(int i=0;i<x.length();i++)
            {
                if(Character.isAlphabetic(x.charAt(i)))
                {
                    y=y+x.charAt(i);
                }
            }
            if(y.equals(""))
            {
                continue;
            }
            m.put(y,m.getOrDefault(y,0)+1);
        }
        for(String a:banned)
        {
            s.add(a);
        }
        String ans="";
        int max=0;
        for(String a:m.keySet())
        {
            if(s.contains(a))
            {
                continue;
            }
            if(m.get(a)>max)
            {
                ans=a;
                max=m.get(a);
            }
            System.out.println(a+"  "+m.get(a));
        }
        return ans;
    }
}