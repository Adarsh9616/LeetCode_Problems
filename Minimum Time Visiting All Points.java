class Solution
{
    public int minTimeToVisitAllPoints(int[][] points)
    {
        int sum=0;
         for(int i=1;i<points.length;i++)
         {
             int a=Math.abs(points[i][0]-points[i-1][0]);
             int b=Math.abs(points[i][1]-points[i-1][1]);
             sum=sum+Math.max(a,b);
             
         }
        return sum;
    }
}