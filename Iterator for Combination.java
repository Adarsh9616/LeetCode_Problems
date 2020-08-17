class CombinationIterator 
{
    Queue<String> q;

    public CombinationIterator(String characters, int combinationLength) 
    {
        q=new LinkedList<>();
        StringBuilder s=new StringBuilder("");
        createCombinations(s,characters,0,combinationLength);
        
    }
    public void createCombinations(StringBuilder s,String given,int start,int length)
    {
        if(length==0)
        {
            q.add(s.toString());
            return;
        }
        for(int i=start;i<given.length();i++)
        {
            s.append(given.charAt(i));
            createCombinations(s,given,i+1,length-1);
            s.deleteCharAt(s.length()-1);
        }
    }
    
    public String next() 
    {
        return q.poll();
    }
    
    public boolean hasNext() 
    {
        return !q.isEmpty();    
    }
}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */