class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) 
    {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp[]=new ArrayList[groupSizes.length+2];
        for(int i=0;i<=groupSizes.length+1;i++)
        {
            temp[i]=new ArrayList<>();
        }
        for(int i=0;i<groupSizes.length;i++)
        {
            temp[groupSizes[i]].add(i);
        }
        for(int i=0;i<=groupSizes.length+1;i++)
        {
            if(!temp[i].isEmpty())
            {
                List<Integer> t=new ArrayList<>();
                for(int k:temp[i])
                {
                    t.add(k);
                    if(t.size()==i)
                    {
                        ans.add(new ArrayList<>(t));
                        t.clear();
                    } 
                }
            }
        }
        return ans;
    }
}