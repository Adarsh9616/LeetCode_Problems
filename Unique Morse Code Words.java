class Solution {
    public int uniqueMorseRepresentations(String[] words) 
    {
        Set<String> s=new HashSet<String>();
        String ar[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(String m:words)
        {
            StringBuilder l=new StringBuilder("");
            for(char c:m.toCharArray())
            {
                l.append(ar[c-'a']);
            }
            s.add(String.valueOf(l));
        }
        return s.size();
        
    }
}