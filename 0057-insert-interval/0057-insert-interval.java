class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval)
    {
        int c=addInIntervals(intervals,newInterval);
        Stack<int[]> st=new Stack<>();
        for(int i=0;i<intervals.length+1;i++)
        {
            int interval[];
            if(i==c)
            {
                interval=newInterval;
            }
            else if(i<c)
            {
                interval=intervals[i];
            }
            else
            {
                interval=intervals[i-1];
            }
            if(!st.isEmpty())
            {
                int a[]=st.peek();
                int start=interval[0];
                int end=a[1];
                if(interval[0]<=end)
                {
                    st.pop();
                    start=a[0];
                    end=Math.max(end,interval[1]);
                    st.push(new int[]{start,end});
                }
                else
                {
                    st.push(interval);
                }
            }
            else
            {
                st.push(interval);
            }
        } 
        int ans[][]=new int[st.size()][2];
        int k=st.size()-1;
        while(!st.isEmpty())
        {
            ans[k--]=st.pop();
        }
        return ans;
    }
    public int addInIntervals(int[][] intervals, int[] newInterval)
    {
        int k=-1;
        for(int i=0;i<intervals.length;i++)
        {
            if(newInterval[0]<intervals[i][0])
            {
                k=i;
                break;
            }
        }

        return k==-1?intervals.length:k;
    }
}