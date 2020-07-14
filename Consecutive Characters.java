class Solution {
    public int maxPower(String s) 
    {
 char[] c = s.toCharArray();
        int count = 1;
        int max = 1;
        
        for(int i = 0; i < c.length - 1 ; i++)
        {
            while(i < c.length-1 && c[i] == c[i+1])
            {
                count++;
                i++;
            }
            
            max = Math.max(max,count);
            count = 1;
            
        }
        
        return max;
        
    }
}