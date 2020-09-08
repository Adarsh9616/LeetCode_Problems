class Solution {
    public boolean wordPattern(String pattern, String str) 
    {
        String ar[]=str.split(" ");
        HashMap<Character,String> m=new HashMap<>();
        if(pattern.length()!=ar.length)
        {
            return false;
        }
        int i=0;
        Set<String> set=new HashSet<>();
        for(char c:pattern.toCharArray())
        {
            if(m.containsKey(c))
            {
                String s=m.get(c);
                if(!s.equals(ar[i]))
                {
                   // System.out.println(c+" "+ar[i]);
                    return false;
                }
            }
            else
            {
                if(set.contains(ar[i]))
                {
                    return false;
                }
                set.add(ar[i]);
                m.put(c,ar[i]);
            }
            i++;
        }
        return true;
    }
}