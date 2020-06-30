class Solution {
    public int numberOfSteps (int num) 
    {
        int count=0;
        while(num>0)
        {
            if((num&1)==0)
            {
                count++;
                num=num>>1;
            }
            else
            {
                num--;
                count++;
            }
        }
        return count;
        
        
    }
}