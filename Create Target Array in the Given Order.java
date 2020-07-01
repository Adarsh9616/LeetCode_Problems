class Solution {
    public int[] createTargetArray(int[] nu, int[] in)
    {
        int n=nu.length;
        List<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            a.add(in[i],nu[i]);
        }
        int j=0;
        int ar[]=new int[n];
        for(int i:a)
        {
            ar[j]=i;
            j++;
        }
        return ar;
        
    }
}