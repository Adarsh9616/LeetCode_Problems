class Solution 
{
    public int[] decompressRLElist(int[] nums) 
    {
        int n=nums.length;
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n-1;i+=2)
        {
            int f=nums[i];
            int val=nums[i+1];
            for(int j=0;j<f;j++)
            {
                a.add(val);
            }
        }
        int[] ar = new int[a.size()]; 
        int j=0;
        for(int i:a)
        {
            ar[j]=i;
            j++;
        }
        return ar;
    }
}