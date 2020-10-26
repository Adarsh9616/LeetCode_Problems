class Solution {
    public boolean find132pattern(int[] nums) 
    {
        if(nums.length<3)
        {
            return false;
        }
        Stack<Integer> s=new Stack<>();
        int min[]=new int[nums.length];
        min[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            min[i]=Math.min(min[i-1],nums[i]);
        }
        for(int j=nums.length-1;j>=0;j--)
        {
            if(nums[j]>min[j])
            {
                while(!s.isEmpty()&&s.peek()<=min[j])
                {
                    s.pop();
                }
                if(!s.isEmpty()&&s.peek()<nums[j])
                {
                    return true;
                }
                s.push(nums[j]);
            }
        }
        return false;
    }
}