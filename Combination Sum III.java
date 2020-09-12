class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) 
    {
        LinkedList<Integer> l=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
        solve(l,k,n,n,1,ans);
        return ans;
    }
    public void solve(LinkedList<Integer> l, int k,int n,int target,int i,List<List<Integer>> ans)
    {
        if(target==0&&k==0)
        {
            ans.add(new ArrayList<Integer>(l));
            return;
        }
        else if(target<0||k<0)
        {
            return;
        }
        for(int j=i;j<=9;j++)
        {
            l.add(j);
            solve(l,k-1,n,target-j,j+1,ans);
            l.removeLast();
        }
    }
}