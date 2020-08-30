class Solution 
{
    public int[] nextGreaterElements(int[] nums) 
    {
        if(nums.length==0)
        {
            return new int[]{};
        }
        int ar[]=new int[2*nums.length];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<nums.length;i++)
        {
            ar[i]=nums[i];
            ar[nums.length+i]=nums[i];
        }
        int ans[]=new int[ar.length];
        for(int i=0;i<ar.length;i++)
        {
            while(!s.isEmpty()&&ar[i]>ar[s.peek()])
            {
                ans[s.pop()]=ar[i];
            }
            s.push(i);
        }
        while(!s.isEmpty())
        {
            ans[s.pop()]=-1;
        }
        return Arrays.copyOfRange(ans,0,nums.length);
    }
}