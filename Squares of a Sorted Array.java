class Solution 
{
    public int[] sortedSquares(int[] A) 
    {
        int n=A.length;
        int ar[]=new int[n];
        int i=0;int j=0;
        while(j<n&&A[j]<0)
        {
            j++;
        }
        i=j-1;
        int t=0;
        while(i>=0&&j<n)
        {
            int k=A[i]*A[i];
            int l=A[j]*A[j];
            if(k<l)
            {
                ar[t]=k;
                i--;
                t++;
            }
            else if(k>l)
            {
                j++;
                ar[t]=l;
                t++;
            }
            else
            {
                ar[t]=k;
                ar[t+1]=k;
                t++;
                t++;
                i--;
                j++;
            }
            
        }
        while (i >= 0) {
            ar[t++] = A[i] * A[i];
            i--;
        }
        while (j < n) {
            ar[t++] = A[j] * A[j];
            j++;
        }
        return ar;
    }
}