class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration)
    {
        int ans=0;
        if(timeSeries.length==0)
        {
            return 0;
        }
        for(int i=timeSeries.length-1;i>0;i--)
        {
            if(timeSeries[i]-timeSeries[i-1]>duration)
            {
                ans+=duration;
            }
            else
            {
                ans+=timeSeries[i]-timeSeries[i-1];
            }
            
        }
        ans+=duration;
        return ans;
    }
}