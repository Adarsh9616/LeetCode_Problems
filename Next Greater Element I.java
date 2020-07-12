class Solution 
{
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        HashMap<Integer,Integer> m=new HashMap<>();
        Stack<Integer> s=new Stack<>();
        for(int i:nums2)
        {
            while(!s.isEmpty()&&s.peek()<i)
            {
                m.put(s.pop(),i);
            }
            s.push(i);
        }
        for(int i=0;i<nums1.length;i++)
        {
            nums1[i]=m.getOrDefault(nums1[i],-1);
        }
        return nums1;
        
    }
}