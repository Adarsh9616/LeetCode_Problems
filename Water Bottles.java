class Solution {
    public int numWaterBottles(int numBottles, int numExchange) 
    {
        int ans=numBottles;
        int k=numBottles/numExchange;
        ans=ans+k;
        int m=numBottles%numExchange+k;
        while(m>=numExchange)
        {
            int l=m/numExchange;
            ans=ans+l;
            m=l+m%numExchange;
        }
        //ans=ans+m/numExchange;
        return ans;
        
    }
}