class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i:prices)
        {
            if(i<minprice)
            {
                minprice=i;
            }
            else if(i-minprice>maxprofit)
            {
                maxprofit=i-minprice;
            }
        }
        return maxprofit;
    }
}