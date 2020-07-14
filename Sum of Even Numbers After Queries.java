class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] q) 
    {
        int sum=0;
        for(int i:A)
        {
            if((i&1)==0)
                sum+=i;
        }
        int l=q.length;
        int ans[]=new int[l];
        for(int i=0;i<l;i++)
        {
            int num=q[i][0];
            int p=q[i][1];
            int n=A[p];
            A[p]=n+num;
            if((n&1)==0)
            {   
                if((A[p]&1)==0)
                    sum=sum+num;
                else
                    sum=sum-n;
            }
            else
            {
                if((A[p]&1)==0)
                    sum=sum+A[p];
            }
            ans[i]=sum;
        }
        return ans;
        
    }
}