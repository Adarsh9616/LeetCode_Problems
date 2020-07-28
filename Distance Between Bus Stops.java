class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) 
    {
        int sum=0;
        int total=0;
        if(start>destination)
        {
            int temp=start;
            start=destination;
            destination=temp;
        }
        for(int i=0;i<distance.length;i++)
        {
            if(i>=start&&i<destination)
            {
                sum=sum+distance[i];
            }
            total+=distance[i];
        }
        return Math.min(sum,total-sum);
        
    }
}