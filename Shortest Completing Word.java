class Solution {
    public String shortestCompletingWord(String s, String[] words) 
    {
        int[] counts = new int[26];
        int total = 0; 
        for (char c : s.toLowerCase().toCharArray()) {
            if ('a' <= c && c <= 'z') {
                counts[c - 'a']++;
                total++;
            }
        }

        String res = null;
        for (String w : words) {
            int n = total;
            int[] cnts = counts.clone();
            for (char c : w.toCharArray())
                if (cnts[c - 'a']-- > 0) n--;
            if (n == 0 && (res == null || w.length() < res.length()))
                res = w;
        }
        return res;
        
    }
}