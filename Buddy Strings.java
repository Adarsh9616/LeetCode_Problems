class Solution {
    public boolean buddyStrings(String A, String B)
    {
        if(A.length() != B.length()) return false;
        
        int freqA[] = new int[26];
        int freqB[] = new int[26];
        for(int i=0; i<A.length(); i++) {
            freqA[A.charAt(i) - 'a']++;
            freqB[B.charAt(i) - 'a']++;
        }
        
        for(int i=0; i<freqA.length; i++)
            if(freqA[i] != freqB[i])
                return false;
        
        if(A.equals(B)) {
            for(int i=0; i<freqA.length; i++) {
                if(freqA[i] >= 2)
                    return true;
            }
            return false;
        }
        
        int swapCount = 0;
        for(int i=0; i<A.length(); i++)
            if(A.charAt(i) != B.charAt(i))
                swapCount++;
        
        return swapCount == 2;
    }
}