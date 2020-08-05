class Solution {
    public List<List<Integer>> largeGroupPositions(String s)
    {
        List<List<Integer>> ans=new ArrayList<>();
        int i=0;int n=s.length();
        for(int j=0;j<n;j++)
        {
            if(j==n-1||s.charAt(j)!=s.charAt(j+1))
            {
                 if (j-i+1 >= 3)
                    ans.add(Arrays.asList(new Integer[]{i, j}));
                i = j + 1;
            }
        }

        return ans;
    }
}