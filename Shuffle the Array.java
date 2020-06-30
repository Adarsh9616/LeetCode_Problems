class Solution {
    public int[] shuffle(int[] nums, int n) 
    {
        int k=n;
        int l=0;
        int ar[]=new int[2*n];
        for(int i=0,j=1;j<2*n;i+=2,j+=2)
        {
            ar[i]=nums[l];
            l++;
            ar[j]=nums[k];
            k++;
        }
        return ar;
        
    }
}