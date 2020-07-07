class Solution {
    public String freqAlphabets(String s) 
    {
        Map<String,Character> m=new HashMap<>();
        int j=1;
        for(int i=(int)'a';i<=(int)'z';i++)
        {
            if(i<=(int)'i')
            {
                m.put(String.valueOf(j),(char)i);
            }
            else
            {
                m.put(String.valueOf(j)+'#',(char)i);
            }
            j++;
        }
        String ans="";
        for(int i=s.length()-1;i>=0;i--)
        {
            char c=s.charAt(i);
            if(c=='#')
            {
                int k=i-2;
                String ss=s.substring(k,i+1);
                i=i-2;
                char cc=m.get(ss);
                ans=""+cc+ans;
            }
            else
            {
                char cc=m.get(""+c);
                ans=""+cc+ans;
            }
        }
        return ans;
    }
}