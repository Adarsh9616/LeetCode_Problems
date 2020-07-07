class Solution 
{
    public class Solve implements Comparator<int[]>
    {
        public int compare(int a[],int b[])
        {
            return a[1]-b[1];
        }
    }
    public int[] kWeakestRows(int[][] mat, int k) 
    {
        int s[][]=new int[mat.length][2];
        int ans[]=new int[k];
        for(int i=0;i<mat.length;i++)
        {
            int sum=0;
            for(int j=0;j<mat[0].length;j++)
            {
                sum=sum+mat[i][j];
            }
            s[i][0]=i;
            s[i][1]=sum;
        }
        Arrays.sort(s,new Solve());
        for(int i=0;i<k;i++)
        {
            ans[i]=s[i][0];
        }
        return ans;
    }
}