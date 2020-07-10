class Solution {
    public int[] numberOfLines(int[] widths, String S) 
    {
        //int line=0;
        int count=0;
        int sum=0;
        for(char c:S.toCharArray())
        {
            sum=sum+widths[c-'a'];
            if(sum>100)
            {
                sum=widths[c-'a'];
                count++;
            }
        }
        return new int[]{count+1,sum};
        
    }
}