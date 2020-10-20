class Solution {
    public int minDominoRotations(int[] A, int[] B) 
    {
        int minMoves=Integer.MAX_VALUE;
        for(int i=1;i<=6;i++)
        {
            minMoves=Math.min(checkCount(A,B,i),minMoves);
            minMoves=Math.min(checkCount(B,A,i),minMoves);
        }
        return minMoves!=Integer.MAX_VALUE?minMoves:-1;   
    }
    public int checkCount(int A[],int B[],int num)
    {
        int res=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]==num)
            {
                continue;
            }
            else if(B[i]==num)
            {
                res++;
            }
            else
            {
                return Integer.MAX_VALUE;
            }
        }
        return res;
    }
}