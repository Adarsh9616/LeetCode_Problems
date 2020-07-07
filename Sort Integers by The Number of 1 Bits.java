class Solution 
{
    class Solve implements Comparator<int[]>
    {
        public int compare(int a[],int b[])
        {
            return a[1]-b[1];
           
        }
    }
    public int[] sortByBits(int[] arr) 
    {
        Arrays.sort(arr);
        int ans[]=new int[arr.length];
        int m[][]=new int[arr.length][2];
        int j=0;
        for(int i:arr)
        {
            m[j][0]=i;
            m[j][1]=Integer.bitCount(i);
            j++;
        }
        Arrays.sort(m,new Solve());
        for(int i=0;i<arr.length;i++)
        {
            ans[i]=m[i][0];
        }
        return ans;
        
    }
}