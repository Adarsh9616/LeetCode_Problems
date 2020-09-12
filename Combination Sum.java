class Solution 
{
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        LinkedList<Integer> l=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
        solve(l,candidates,target,0,ans);
        return ans;
    }
    public void solve(LinkedList<Integer> l, int ar[],int target,int i,List<List<Integer>> ans)
    {
        if(target==0)
        {
            ans.add(new ArrayList<Integer>(l));
            return;
        }
        else if(target<0)
        {
            return;
        }
        for(int j=i;j<ar.length;j++)
        {
            l.add(ar[j]);
            solve(l,ar,target-ar[j],j,ans);
            l.removeLast();
        }
    }
}