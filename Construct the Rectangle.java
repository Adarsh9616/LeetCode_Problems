class Solution {
    public int[] constructRectangle(int area) 
    {
        int i=(int)Math.sqrt(area);
        for(;i>=1;i--)
        {
            if(area%i==0)
            {
                return new int[]{area/i,i};
            }
        }
        return new int[]{};
    }
}