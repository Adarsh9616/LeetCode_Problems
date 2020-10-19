class Solution 
{
    HashMap<String,Integer> map=new HashMap<>();
    public int maxProfit(int k, int[] prices) 
    {
        if (k >= prices.length / 2) 
        { 
            int maxProfit = 0;
            for (int i = 1; i < prices.length; i++)
                if (prices[i] > prices[i - 1])
                    maxProfit += prices[i] - prices[i - 1];
            return maxProfit;
        }
        return solve(prices,k,0,0);
    }
    public int solve(int ar[],int k,int i,int buyOrSell)
    {
        if(k<=0||i>=ar.length)
        {
            return 0;
        }
        String key=k+" "+i+" "+buyOrSell;
        if(map.containsKey(key))
        {
            return map.get(key);
        }
        int profit=0;
        if(buyOrSell==0)
        {
            profit=Math.max(-ar[i]+solve(ar,k,i+1,1),solve(ar,k,i+1,0));
        }
        else
        {
            profit=Math.max(ar[i]+solve(ar,k-1,i+1,0),solve(ar,k,i+1,1));
        }
        map.put(key,profit);
        return profit;
    }
}