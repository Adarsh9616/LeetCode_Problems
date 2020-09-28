class Solution {
    public int minOperations(String[] logs) 
    {
        int count=0;
        for(String s:logs)
        {
            if(s.equals("../"))
            {
                count--;
                if(count<0)
                {
                    count=0;
                }
            }
            else if(s.equals("./"))
            {
                
            }
            else
            {
                count++;
            }
        }
        if(count<0)
        {
            return 0;
        }
        return count;
    }
}