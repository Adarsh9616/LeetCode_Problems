class Solution {
    public int[] dailyTemperatures(int[] T) 
    {
        int ans[]=new int[T.length];
        Stack<Integer> s=new Stack<>();
        for(int i=T.length-1;i>=0;i--)
        {
            while(!s.isEmpty()&&T[s.peek()]<=T[i])
            {
                s.pop();
            }
            ans[i]=s.isEmpty()?0:s.peek()-i;
            s.push(i);
        }
        return ans;
    }
}