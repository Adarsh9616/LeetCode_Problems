class Solution 
{
    List<List<Integer>> ans=new ArrayList<>();
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) 
    {
        int n=graph.length;
        boolean vis[]=new boolean[n];
        List<Integer> temp=new ArrayList<>();
        solve(0,n-1,vis,graph,temp);
        return ans;
    }
    public void solve(int src,int dest,boolean vis[],int graph[][],List<Integer> temp)
    {
        if(src==dest)
        {
            temp.add(src);
            ans.add(new ArrayList<>(temp));
            temp.remove(temp.size()-1);
            return;
        }
        vis[src]=true;
        temp.add(src);
        for(int i:graph[src])
        {
            if(!vis[i])
            {
                vis[i]=true;
                solve(i,dest,vis,graph,temp);
                vis[i]=false;
            }
        }
        vis[src]=false;
        temp.remove(temp.size()-1);
    }
    
}