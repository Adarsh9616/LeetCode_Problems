class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) 
    {
        int l=0;int m=0;
        int ans[][]=new int[r][c];
        if(r*c>nums.length*nums[0].length)
        {
            return nums;
        }
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[0].length;j++)
            {
                if(m==c)
                {
                    m=0;
                    l++;
                }
                ans[l][m]=nums[i][j];
                m++;
            }
        }
        return ans;
        
    }
}