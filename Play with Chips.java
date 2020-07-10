class Solution {
    public int minCostToMoveChips(int[] chips) 
    {
        int even=0;
        for(int i:chips)
        {
            if((i&1)==0)
            {
                even++;
            }
        }
        return Math.min(even,chips.length-even);
    }
}