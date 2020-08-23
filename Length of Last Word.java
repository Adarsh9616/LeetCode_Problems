class Solution {
    public int lengthOfLastWord(String s) 
    {
        String a[]=s.split(" ");
        if(a.length==0)
        {
            return 0;
        }
        return a[a.length-1].length();
    }
}