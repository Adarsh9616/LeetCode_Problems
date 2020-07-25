class Solution {
    public boolean detectCapitalUse(String word)
    {
        String a=word.toUpperCase();
        String b=word.toLowerCase();
        String c=Character.toUpperCase(word.charAt(0))+word.substring(1).toLowerCase();
        if(word.equals(a)||word.equals(b)||word.equals(c))
        {
            return true;
        }
        return false;
    }
}