class Solution
{
    public int twoCitySchedCost(int[][] costs)
    {
        int cost=0;
        Arrays.sort(costs,(a,b)->((a[0]-a[1])-(b[0]-b[1])));
        
        for(int i=0;i<costs.length/2;i++)
        {
            cost+=costs[i][0];
            cost+=costs[costs.length/2+i][1];
        }
        return cost;
        
    }
}