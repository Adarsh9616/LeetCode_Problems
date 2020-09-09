class Solution 
{
    public int canCompleteCircuit(int[] gas, int[] cost) 
    {
        int sum = 0, curSum = 0, n = gas.length, startIdx = 0;
        
        for (int i = 0; i < n; i++)
        {
            int tank = gas[i] - cost[i];
            
            if (tank > curSum + tank)
            {
                startIdx = i;
                curSum = tank;
            }
            else
                curSum = curSum + tank;
            
            sum += tank;
        }
        
        return sum >= 0 ? startIdx : -1;
    }
}