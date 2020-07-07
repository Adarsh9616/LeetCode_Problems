class Solution {
    public List<String> buildArray(int[] ar, int n) 
    {
        List<String> ans=new ArrayList<>();
        int j=1;
        int k=0;
        for(int i=1;i<=n;i++)
        {

            if(ar[k]==i)
            {
                ans.add("Push");
            }
            else
            {
                while(i<ar[k])
                {
                    ans.add("Push");
                    ans.add("Pop");
                    i++;
                }
                ans.add("Push");
            }
            k++;
            if(k==ar.length)
            {
                break;
            }
            
        }
        return ans;
    }
}