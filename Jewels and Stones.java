class Solution {
    public int numJewelsInStones(String J, String S) 
    {
HashSet<Character> jewels = new HashSet<>();
        
        //add characters of J to jewels hashset
        for(char c: J.toCharArray()){
            jewels.add(c);
        }
        
        int numJewels = 0;
        
        //for each character in S, check if it's in jewels hashset
        for (char c: S.toCharArray()){
            if (jewels.contains(c))
                numJewels++;
        }
        
        return numJewels;
    }
}