class Solution {
    public int distributeCandies(int[] candies) {
        int numCandies  = candies.length;
        int kindsCount  = 0;
        boolean[] types = new boolean[200001];
        
        for (int i = 0; i < candies.length; i++)
        {
            int index = candies[i] + 100000;
            if (!types[index] && (numCandies > (candies.length/2)))
            {
                types[index] = true;
                kindsCount   += 1;
                numCandies   -= 1;
            }
        }
        
        return kindsCount;
    }
}