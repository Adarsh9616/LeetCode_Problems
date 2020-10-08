class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) 
    {
        int ar[]=new int[n];
        for(List i:edges)
        {
            ar[(int)i.get(1)]++;
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(ar[i]==0)
            {
                ans.add(i);
            }
        }
        return ans;
    }
}