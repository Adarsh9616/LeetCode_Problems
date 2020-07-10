class Solution {
    public String[] findWords(String[] words)
    {
        int[] rows = {2,3,3,2,1,2,2,2,1,2,2,2,3,3,1,1,1,1,2,1,1,3,1,3,1,3};
        List<String> l=new ArrayList<String>();
        for(String s:words)
        {
            boolean b=true;
            String sa=s.toLowerCase();
            int ro=rows[sa.charAt(0)-'a'];
            for(char c:sa.toCharArray())
            {
                int r=rows[c-'a'];
                if(ro!=r)
                {
                    b=false;
                    break;
                }
            }
            if(b)
            {
                l.add(s);
            }
            
        }
        String ans[]=new String[l.size()];
        int i=0;
        for(String s:l)
        {
            ans[i++]=s;
        }
        return ans;
        
    }
}