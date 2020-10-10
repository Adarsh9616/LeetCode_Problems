class Solution 
{
    int ar[];
    Random r;
    public Solution(int[] nums) {
        ar=nums;
        r=new Random();
    }
    
    public int pick(int target) 
    {
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==target)
            {
                l.add(i);
            }
        }
        return l.get(r.nextInt(l.size()));
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */