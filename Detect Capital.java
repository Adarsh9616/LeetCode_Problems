class Solution {
    public boolean detectCapitalUse(String word) 
    {
        if(word.equals(""))
        {
            return true;
        }
        String s=word.toUpperCase();
        String ss=word.toLowerCase();
        String sss=Character.toUpperCase(word.charAt(0))+ss.substring(1);
        if(word.equals(s)||word.equals(ss)||word.equals(sss))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}