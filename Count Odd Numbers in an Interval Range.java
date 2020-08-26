class Solution 
{
    public int countOdds(int low, int high) 
    {
        int ans=(high-low)/2;
        if((low&1)!=0||(high&1)!=0)
        {
            ans++;
        }
        return ans;
    }
}