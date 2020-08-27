class Solution
{
    public void rotate(int[][] mat)
    {
        for(int i=0;i<mat.length;i++)
        {
            for(int j=i;j>=0;j--)
            {
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat.length/2;j++)
            {
                int temp=mat[i][j];
                mat[i][j]=mat[i][mat.length-j-1];
                mat[i][mat.length-j-1]=temp;
            }
        }
    }
}