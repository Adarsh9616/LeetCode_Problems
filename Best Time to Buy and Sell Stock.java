class Solution {
    public int maxProfit(int[] prices) 
    {
        if(prices.length==0)
        {
            return 0;
        }
        int profit=0;
        int lastmax=prices[0];
        int lastmin=prices[0];
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]>lastmax)
            {
                lastmax=prices[i];
            }
            if(lastmin>prices[i])
            {
                lastmin=prices[i];
                lastmax=prices[i];
            }
            profit=Math.max(profit,lastmax-lastmin);
        }
        return profit;
    }
}