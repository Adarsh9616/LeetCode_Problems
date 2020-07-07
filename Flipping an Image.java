class Solution {
    public int[][] flipAndInvertImage(int[][] A) 
    {
        int n=A.length;
        int m=A[0].length;
        int ar[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                ar[i][m-j-1]=(A[i][j]==0)?1:0;
            }
        }
        return ar;
    }
}