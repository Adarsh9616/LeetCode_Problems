class Solution 
{
    public int[] relativeSortArray(int[] arr1, int[] arr2) 
    {
        int ar1[]=new int[1001];
        //int ar2[]=new int[1001];
        int ans[]=new int[arr1.length];
        for(int i:arr1)
        {
            ar1[i]++;
        }
        int j=0;
        for(int i:arr2)
        {
            while(ar1[i]-->0)
            {
                ans[j++]=i;
            }
        }
        for(int i=0;i<1001;i++)
        {
            while(ar1[i]-->0)
            {
                ans[j++]=i;
            }
        }
        
        return ans;
    }
}