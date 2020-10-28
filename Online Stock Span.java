class StockSpanner {

    Stack<Integer> prices;
    Stack<Integer> weight;
    public StockSpanner() 
    {
        prices=new Stack<>();
        weight=new Stack<>();
    }
    
    public int next(int price)
    {
        int k=1;
        while(!prices.isEmpty()&&prices.peek()<=price)
        {
            prices.pop();
            k+=weight.pop();
        }
        prices.push(price);
        weight.push(k);
        return k;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */