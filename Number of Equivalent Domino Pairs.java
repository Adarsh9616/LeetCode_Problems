class Solution {
    public int numEquivDominoPairs(int[][] dominoes) 
    {
        Map<Integer, Integer> dic = new HashMap<>();
        int res = 0;
        for(int[] domino : dominoes) {
            int val = domino[0] < domino[1] ? domino[0] * 10 + domino[1] : domino[1] * 10 + domino[0];
            int count = dic.getOrDefault(val,0);
            dic.put(val, count + 1);
            res = res + count;
        }
        return res;
        
    }
}