class Solution 
{
    public int[][] merge(int[][] intervals) 
    {
        if(intervals.length==0)
        {
            return new int[][]{};
        }
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        Stack<int[]> stack=new Stack<>();
        stack.push(intervals[0]);
        for(int a[]:intervals)
        {
            int temp[]=stack.peek();
            if(a[0]<=temp[1])
            {
                int end=Math.max(a[1],temp[1]);
                int start=temp[0];
                stack.pop();
                stack.push(new int[]{start,end});
            }
            else
            {
                stack.push(a);
            }
        }
        int ans[][]=new int[stack.size()][2];
        int i=0;
        for(int a[]:stack)
        {
            ans[i++]=a;
        }
        return ans;
    }
}