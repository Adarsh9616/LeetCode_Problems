class Solution 
{
    public boolean canFinish(int numCourses, int[][] prereq) 
    {    
        int indegree[]=new int[numCourses];
        int count=0;
        for(int i[]:prereq)
        {
            indegree[i[0]]++;
        }
        Stack<Integer> st=new Stack<>();
        int k=0;
        for(int i:indegree)
        {
            if(i==0)
            {
                st.push(k);
            }
            k++;
        }
        while(!st.isEmpty())
        {
            int cur=st.pop();
            count++;
            for(int i[]:prereq)
            {
                if(cur==i[1])
                {
                    indegree[i[0]]--;
                    if(indegree[i[0]]==0)
                    {
                        st.push(i[0]);
                    }
                }
            }
        }
        return count==numCourses;
    }
}