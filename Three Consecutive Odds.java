class Solution {
    public boolean threeConsecutiveOdds(int[] arr) 
    {
        if(arr.length<3)
        {
            return false;
        }
        for(int i=2;i<arr.length;i++)
        {
            if((arr[i]&1)!=0&&(arr[i-1]&1)!=0&&(arr[i-2]&1)!=0)
            {
                return true;
            }
        }
        return false;
    }
}