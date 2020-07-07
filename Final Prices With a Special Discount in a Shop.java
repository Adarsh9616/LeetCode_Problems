class Solution 
{
    public int[] finalPrices(int[] prices) 
    {
        int[] cost=new int[prices.length];
        Arrays.fill(cost,-1);
        
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]<=prices[i]){
                    cost[i]=prices[i]-prices[j];
                    break;
                }
            }
            if(cost[i]==-1) cost[i]=prices[i];
        }
        return cost;
    }
}