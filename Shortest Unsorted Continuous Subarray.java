class Solution {
    public int findUnsortedSubarray(int[] nums) 
    {
        Stack<Integer> s=new Stack<>();
        int l=nums.length;
        int r=0;
        for(int i=0;i<nums.length;i++)
        {
            while(!s.isEmpty()&&nums[s.peek()]>nums[i])
            {
                l=Math.min(l,s.pop());
            }
            s.push(i);
        }
        s.clear();
        for(int i=nums.length-1;i>=0;i--)
        {
            while(!s.isEmpty()&&nums[s.peek()]<nums[i])
            {
                r=Math.max(r,s.pop());
            }
            s.push(i);
        }
        return r-l>0?r-l+1:0;
    }
}