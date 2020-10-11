class Solution {
    public int maxDepth(String s) 
    {
        int max=-1;
        int count=0;
        for(char c:s.toCharArray())
        {
            if(c=='(')
            {
                count++;
            }
            else if(c==')')
            {
                count--;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}