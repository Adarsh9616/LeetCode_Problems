class Solution {
    public String longestWord(String[] words) 
    {
        Arrays.sort(words);
        String ans="";
        HashSet<String> s=new HashSet<>();
        for(String w:words)
        {
            if(w.length()==1|| s.contains(w.substring(0,w.length()-1)))
            {
                if(w.length()>ans.length())
                {
                    ans=w;
                }
                s.add(w);
            }
        }
        return ans;
        
    }
}