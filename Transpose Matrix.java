class Solution {
    public int[][] transpose(int[][] A) 
    {
        int ar[][]=new int[A[0].length][A.length];
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[0].length;j++)
            {
                ar[j][i]=A[i][j];
            }
        }
        return ar;
    }
}