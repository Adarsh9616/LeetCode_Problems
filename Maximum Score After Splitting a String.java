class Solution {
    public int maxScore(String s) 
    {
        int count=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            char c=s.charAt(i);
            if(c=='1')
            {
                count++;
            }
        }
        int max=-1;
        for(int i=0;i<s.length()-1;i++)
        {
            char c=s.charAt(i);
            if(c=='0')
            {
                count++;
            }
            else
            {
                count--;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}