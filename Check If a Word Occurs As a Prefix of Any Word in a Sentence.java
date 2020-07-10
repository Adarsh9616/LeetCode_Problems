class Solution 
{
    public int isPrefixOfWord(String sentence, String searchWord) 
    {
        String s[]=sentence.split(" ");
        int i=-2;
        int j=0;
        for(String ss:s)
        {
            if(ss.startsWith(searchWord))
            {
                i=j;
                break;
            }
            j++;
        }
        return i+1;
    }
}