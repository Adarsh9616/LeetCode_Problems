class Solution 
{
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] ar, int target) 
    {
        List<Integer> lis=new ArrayList<>();
        solve(ar,target,lis,0);
        return ans;
    }
    public void solve(int ar[],int target,List<Integer> lis,int k)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(lis));
        }
        if(target<0)
        {
            return;
        }
        for(int i=k;i<ar.length;i++)
        {
            lis.add(ar[i]);
            solve(ar,target-ar[i],lis,i);
            lis.remove(lis.size()-1);
        }
    }
}