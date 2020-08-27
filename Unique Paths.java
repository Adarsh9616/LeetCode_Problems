class Solution 
{
    int ar[][];
    public int uniquePaths(int m, int n) 
    {
        ar=new int[m+1][n+1];
        return solve(m,n);
    }
    public int solve(int m,int n)
    {
        if(m==1||n==1)
        {
            return 1;
        }
        if(ar[m][n]!=0)
        {
            return ar[m][n];
        }
        ar[m][n]=solve(m-1,n)+solve(m,n-1);
        return ar[m][n];
    }
}