class Solution 
{
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        HashMap<Integer,Integer> m=new HashMap<>();
        Stack<Integer> s=new Stack<>();
        for(int i:nums2)
        {
            while(!s.isEmpty()&&i>s.peek())
            {
                m.put(s.pop(),i);
            }
            s.push(i);
        }
        int k=0;
        for(int i:nums1)
        {
            nums1[k++]=m.getOrDefault(i,-1);
        }
        return nums1;
    }
}