class Solution {
    public int minDeletionSize(String[] A) 
    {
        int l=A[0].length();
        int c=0;
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<A.length-1;j++)
            {
                if(A[j].charAt(i)>A[j+1].charAt(i))
                {
                    c++;
                    break;
                }
            }
        }
        return c;
    }
}