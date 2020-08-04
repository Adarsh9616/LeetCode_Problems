class Solution {
    public int maxCount(int m, int n, int[][] ops) 
    {
        if(ops.length==0)
        {
            return n*m;
        }
        int a=Integer.MAX_VALUE;
        int b=Integer.MAX_VALUE;
        for(int i[]:ops)
        {
            a=Math.min(a,i[0]);
            b=Math.min(b,i[1]);
        }
        return a*b;
    }
}