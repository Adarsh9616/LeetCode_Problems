class Solution {
    public int heightChecker(int[] h) 
    {
        int ar[]=Arrays.copyOf(h,h.length);
        int count=0;
        Arrays.sort(ar);
        for(int i=0;i<h.length;i++)
        {
            if(ar[i]!=h[i])
            {
                count++;
            }
        }
        return count;
        
    }
}