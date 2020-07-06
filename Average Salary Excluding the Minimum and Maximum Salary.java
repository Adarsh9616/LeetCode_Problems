class Solution {
    public double average(int[] s) 
    {
        double sum=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i:s)
        {
            sum+=i;
            if(i>max)
            {
                max=i;
            }
            if(i<min)
            {
                min=i;
            }
        }
        return (sum-(max+min))/(s.length-2);
        
    }
}