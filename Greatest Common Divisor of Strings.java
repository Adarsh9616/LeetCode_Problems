class Solution {
    public String gcdOfStrings(String str1, String str2) 
    {   
        if(str2.length()>str1.length())
        {
           return gcdOfStrings(str2,str1);
        }
        if(str2.length()==0)
        {
            return str1;
        }
        if (str1.startsWith(str2))
        {
        return gcdOfStrings(str1.substring(str1.indexOf(str2)+str2.length()),str2);
        }
        return "";
        
    }
}