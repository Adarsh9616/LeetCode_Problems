class Solution {
    public int maxProfit(int[] prices) 
    {
        HashMap<String,Integer> m=new HashMap<>();
        return solve(prices,0,0,m);
    }
    public int solve(int prices[],int i,int buyOrSell,HashMap<String,Integer> m)
    {
        if(i>=prices.length)
        {
            return 0;
        }
        String key=i+" "+buyOrSell;
        if(m.containsKey(key))
        {
            return m.get(key);
        }
        int x=0;
        if(buyOrSell==0)//buy condition
        {
            int buy=solve(prices,i+1,1,m)-prices[i];
            int noBuy=solve(prices,i+1,0,m);
            x=Math.max(buy,noBuy);
        }
        else 
        {
            int sell=solve(prices,i+2,0,m)+prices[i];
            int noSell=solve(prices,i+1,1,m);
            x=Math.max(sell,noSell);
        }
        m.put(key,x);
        return x;
    }
}