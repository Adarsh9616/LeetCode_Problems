class Solution 
{

    int color[];
    int N;
    List<Integer> adj[];
    public int[] gardenNoAdj(int n, int[][] edges) 
    {
        N=n;
        adj=new ArrayList[N];
        for(int i=0;i<N;i++)
        {
            adj[i]=new ArrayList<>();
        }
        for(int i[]:edges)
        {
            adj[i[0]-1].add(i[1]-1);
            adj[i[1]-1].add(i[0]-1);
        }
        color=new int[N];
        backtrack(0);
        
        return color;
    }
    
    public boolean backtrack(int u)
    {
        if(u==N)
        {
            return true;
        }
        for(int i=1;i<=4;i++)
        {
            if(isValid(u,i))
            {
                color[u]=i;
                if(backtrack(u+1))
                {
                    return true;
                }
                color[u]=0;
            }
        }
        return false;
    }
    
    public boolean isValid(int u, int c)
    {
        for(int v:adj[u])
        {
            if(color[v]==c)
            {
                return false;
            }
        }
        return true;
    }
}