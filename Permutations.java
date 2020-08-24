class Solution 
{
    List<List<Integer>> li;
    public List<List<Integer>> permute(int[] nums) 
    {
        li=new ArrayList<>();
        solve(nums,0,nums.length-1);
        return li;
    }
    public void solve(int nums[],int l,int r)
    {
        if(l==r)
        {
            ArrayList<Integer> a=new ArrayList<>();
            for(int x:nums)
            {
                a.add(x);
            }
            li.add(a);
            return;
        }
        for(int i=l;i<=r;i++)
        {
            swap(nums,l,i);
            solve(nums,l+1,r);
            swap(nums,l,i);
        }
    }
    public void swap(int nums[],int a,int b)
    {
        int t=nums[a];
        nums[a]=nums[b];
        nums[b]=t;
    }
}