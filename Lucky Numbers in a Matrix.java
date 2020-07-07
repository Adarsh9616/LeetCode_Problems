class Solution 
{
    public List<Integer> luckyNumbers (int[][] ar) 
    {
        int n=ar.length;
        int m=ar[0].length;
        ArrayList<Integer> min=new ArrayList<>();
        ArrayList<Integer> max=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int mm=Integer.MAX_VALUE;
            for(int j=0;j<m;j++)
            {
                if(mm>ar[i][j])
                {
                    mm=ar[i][j];
                }
            }
            min.add(mm);
        }
        for(int i=0;i<m;i++)
        {
            int mm=Integer.MIN_VALUE;
            for(int j=0;j<n;j++)
            {
                if(mm<ar[j][i])
                {
                    mm=ar[j][i];
                }
            }
            max.add(mm);
        }
        for(int i:min)
        {
            if(max.contains(i))
            {
                ans.add(i);
            }
        }
        return ans;
    }
}