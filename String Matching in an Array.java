class Solution
{
    public List<String> stringMatching(String[] words) 
    {
        List<String> res = new ArrayList<String>();
        if(words == null || words.length == 0) {
            return res;
        }
        
        Arrays.sort(words, (a, b) -> (a.length() - b.length()));
        
        for(int i=0; i<words.length-1; i++) {
            for(int j=i+1; j<words.length; j++) {
                int idx = words[j].indexOf(words[i]);
                if(idx != -1) {
                    res.add(words[i]);
                    break;
                }
            }
        }
        return res;
    }
}