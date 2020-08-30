class Solution {
    public int maxArea(int[] h)
    {
        int max=0;
        int i=0;
        int r=h.length-1;
        while(i<r)
        {
            int area=Math.min(h[i],h[r])*(r-i);
            max=Math.max(max,area);
            if(h[i]<h[r])
            {
                i++;
            }
            else
            {
                r--;
            }
        }
        return max;
    }
}