class Solution {
    public boolean checkRecord(String s) 
    {
        int absent=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='A')
            {
                 if(++absent>1)
                    return false;
            }
              
        }
        for(int i=1;i<s.length()-1;i++)
        {
            if(s.charAt(i)=='L'&&s.charAt(i+1)=='L'&&s.charAt(i-1)=='L')
            {
                return false;
            }
            
        }
        return true;
        
    }
}