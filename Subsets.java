class Solution 
{
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) 
    {    
        List<Integer> a=new ArrayList<>();
        solve(nums,0,nums.length,a);
        return ans;
    }
    public void solve(int nums[],int i,int n,List<Integer> a)
    {
        if(i==n)
        {
            ans.add(new ArrayList(a));
            return;
        }
        a.add(nums[i]);
        solve(nums,i+1,n,a);
        a.remove(a.size()-1);
        solve(nums,i+1,n,a);
    }
}