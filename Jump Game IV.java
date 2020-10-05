class Solution {
    public int minJumps(int[] arr) 
    {
        int n=arr.length;
        if(n<2)
        {
            return 0;
        }
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int key=arr[i];
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(i);
        }
        boolean visited[]=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        visited[0]=true;
        int distance =0;
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                int index=q.poll();
                if(index==n-1)
                {
                    return distance;
                }
                if(index-1>=0&&!visited[index-1])
                {
                    q.add(index-1);
                    visited[index-1]=true;
                }
                if(index+1<n&&!visited[index+1])
                {
                    q.add(index+1);
                    visited[index+1]=true;
                }
                List<Integer> sameElementIndexList=map.getOrDefault(arr[index], new ArrayList<>());
                for(int e:sameElementIndexList)
                {
                    if(!visited[e])
                    {
                        q.add(e);
                        visited[e]=true;
                    }
                }
                map.remove(arr[index]);
            }  
            distance++;
        }
        return -1;
    }
}