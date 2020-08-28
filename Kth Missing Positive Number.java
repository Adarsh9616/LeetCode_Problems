class Solution {
    public int findKthPositive(int[] arr, int k) 
    {
        int ar[]=new int[1002+k];
        for(int i:arr)
        {
            ar[i-1]++;
        }
        int j=0;
        int l=1;
        for(int i:ar)
        {
            if(i==0)
            {
                j++;
            }
            if(j==k)
            {
                break;
            }
            l++;
        }
        return l;
    }
}