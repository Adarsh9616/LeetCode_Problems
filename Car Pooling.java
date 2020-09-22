class Solution {
    public boolean carPooling(int[][] trips, int capacity) 
    {
        int ar[]=new int[1001];
        for(int[] i:trips)
        {
            ar[i[1]]+=i[0];
            ar[i[2]]-=i[0];
        }
        int temp=0;
        for(int i:ar)
        {
            temp+=i;
            if(temp>capacity)
            {
                return false;
            }
        }
        return true;
    }
}