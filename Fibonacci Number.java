class Solution {
    public int fib(int N)
    {
        int i=0;
        int j=1;
        int k=0;
        while(k<N)
        {
            int temp=i;
            i=j;
            j=temp+j;        
            k++;
        }
        return i;
        
    }
}