class Solution 
{
    boolean visited[];
    public boolean canReach(int[] arr, int start) 
    {
        visited=new boolean[arr.length];
        return solve(arr,start);
    }
    public boolean solve(int[] arr, int start)
    {
        if(start<0||start>=arr.length||visited[start])
        {
            return false;
        }
        if(arr[start]==0)
        {
            return true;
        }
        visited[start]=true;
        boolean a=solve(arr,start+arr[start]);
        boolean b=solve(arr,start-arr[start]);
        return a||b;
    }
}