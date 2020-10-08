class Solution 
{
    List<Integer> adj[];
    public boolean isBipartite(int[][] graph) 
    {
        boolean vis[]=new boolean[graph.length];
        boolean colour[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++)
        {
            if(!vis[i])
            {
                if(!solve(graph,vis,colour,i))
                {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean solve(int[][] graph,boolean vis[],boolean[] colour, int u)
    {
        vis[u]=true;
        for(int v:graph[u])
        {
            if(!vis[v])
            {
                vis[v]=true;
                colour[v]=!colour[u];
                if(!solve(graph,vis,colour,v))
                {
                    return false;
                }
            }
            else if(colour[u]==colour[v])
            {
                return false;
            }
        }
        return true;
    }
}