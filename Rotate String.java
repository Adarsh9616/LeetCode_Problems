class Solution {
    public boolean rotateString(String A, String B) 
    {
        if(A.length()!=B.length())
        {
            return false;
        }
        if(A.length()==0)
        {
            return true;
        }
        int count=0;
        while(true)
        {
            A=A.substring(1)+A.charAt(0);
            if(A.equals(B))
            {
                return true;
            }
            else
            {
                count++;
            }
            if(count==A.length())
            {
                break;
            }
        }
        return false;
    }
}