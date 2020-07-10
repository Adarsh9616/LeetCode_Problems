class Solution 
{
    public int numSpecialEquivGroups(String[] A) 
    {
        Set<String> set=new HashSet<>();
        for(String s:A)
        {
            int count[]=new int[52];//for even and odd seperate
            int i=0;
            for(char c:s.toCharArray())
            {
                count[c-'a'+26*(i%2)]++;
                i++;
            }
            set.add(Arrays.toString(count));
            //System.out.println(Arrays.toString(count));
        }
        return set.size();
    }
}