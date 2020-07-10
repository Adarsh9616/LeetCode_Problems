class Solution {
    public int findLucky(int[] arr) 
    {
        int ar[]=new int[501];
        for(int i:arr)
        {
            ar[i]++;
        }
        int ans=-1;
        for(int i=1;i<ar.length;i++)
        {
            if(i==ar[i])
            {
                ans=i;
            }
        }
        return ans;
        
    }
}