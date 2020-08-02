class Solution {
    public int findJudge(int N, int[][] trust) 
    {
        int ar[]=new int[N];
        for(int i[]:trust)
        {
            ar[i[0]-1]--;
            ar[i[1]-1]++;
        }
        int j=1;
        for(int i:ar)
        {
            if(i==N-1)
            {
                return j;
            }
            j++;
        }
        return -1;
    }
}