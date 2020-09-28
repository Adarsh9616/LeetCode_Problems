class Solution {
    public int minOperationsMaxProfit(int[] customers, int boardingCost, int runningCost) 
    {
       int profit = 0;
        int maxProfit = 0;
        int rotations = 0;
        int maxRotations = -1;
        int waiting = 0;
        int i = 0;
        while (i < customers.length || waiting > 0) {
			// We can choose customers from waiting pool as well as customers at current index
            if (i < customers.length) {
                waiting += customers[i++];
            }
			// Try accomodating as much customers (max possible is 4)
			// If more than 4 available then use 4 else use all of the waiting
            int count = (waiting >= 4) ? 4 : waiting;
            waiting -= count;
            profit += count * boardingCost - runningCost;
            rotations++;
            if (profit > maxProfit) {
                maxProfit = profit;
                maxRotations = rotations;
            }
        }
        return maxRotations; 
    }
}