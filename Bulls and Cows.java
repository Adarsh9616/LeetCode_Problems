class Solution {
    public String getHint(String secret, String guess) 
    {
        int bull = 0;
        int[] countsSecret = new int[10];
        int[] countsGuess = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            char a = secret.charAt(i);
            char b = guess.charAt(i);
            if (a == b)
                bull ++;
            else {
                countsSecret[a-'0'] ++;
                countsGuess[b-'0'] ++;
            }
        }
        int count = 0;
        for (int i = 0; i < 10; i++)
            count += Math.min(countsSecret[i], countsGuess[i]);
        StringBuilder sb = new StringBuilder();
        sb.append(bull).append("A").append(count).append("B");
        return sb.toString();
    }
}
