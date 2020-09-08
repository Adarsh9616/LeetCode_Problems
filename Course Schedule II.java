class Solution {
    public int[] findOrder(int numCourses, int[][] prereq) 
    {
        int indegree[]=new int[numCourses];
        int ans[]=new int[numCourses];
        int index=0;
        int count=0;
        HashMap<Integer,ArrayList<Integer>> m=new HashMap<>();
        for(int i[]:prereq)
        {
            ArrayList<Integer> list=m.getOrDefault(i[1],new ArrayList<>());
            list.add(i[0]);
            m.put(i[1],list);
            indegree[i[0]]++;
        }
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<indegree.length;i++)
        {
            if(indegree[i]==0)
            {
                s.push(i);
            }
        }
        while(!s.isEmpty())
        {
            int cur=s.pop();
            ans[index++]=cur;
            count++;
            if(m.containsKey(cur))
            {
                for(Integer i:m.get(cur))
                {
                    indegree[i]--;
                    if(indegree[i]==0)
                    {
                        s.push(i);
                    }
                }
            }
        }
        if(count!=numCourses)
        {
            return new int[]{};
        }
        return ans;
    }
}