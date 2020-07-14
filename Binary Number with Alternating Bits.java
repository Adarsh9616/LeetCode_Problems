class Solution {
    public boolean hasAlternatingBits(int n) 
    {
        int t=(n>>1)+n;
        return (t&(t+1))==0;
    }
}