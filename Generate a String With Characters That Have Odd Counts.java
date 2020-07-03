class Solution 
{
    public String generateTheString(int n) 
    {
        if(n == 0) return "";
        char[] result = new char[n];
        int i = -1;
        
        while(++i < n) result[i] = 'a';
        if(n % 2 == 0) result[--i] = 'b';
  
        return new String(result);
    }
}