class Solution 
{
    List<Integer> l=new ArrayList<>();
    public int[] numsSameConsecDiff(int N, int K) 
    {    
        if(N==1)
        {
            return new int[]{0,1,2,3,4,5,6,7,8,9};
        }
        
        for(int i=1;i<=9;i++)
        {
            dfs(N,K,i,0,i);
        }
        int ans[]=new int[l.size()];
        int k=0;
        for(int i:l)
        {
            ans[k++]=i;
        }
        return ans;
    }
    public void dfs(int N,int K,int current,int count,int prev)
    {
        if(count==N-1)
        {
            l.add(current);
            return;
        }
        int next=prev+K;
        if(next<10)
        {
            dfs(N,K,(current*10)+next,count+1,next);
        }
        next=prev-K;
        if(next>=0&&K!=0)
        {
            dfs(N,K,(current*10)+next,count+1,next);
        }
    }
}