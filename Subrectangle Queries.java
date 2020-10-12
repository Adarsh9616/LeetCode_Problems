class SubrectangleQueries 
{
    int ar[][];
    public SubrectangleQueries(int[][] rectangle) {
        ar=rectangle;
    }
    
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) 
    {
        for(int i = row1;i<row2+1;i++)
        {
            Arrays.fill(ar[i],col1,col2+1,newValue);
        }
    }
    
    public int getValue(int row, int col) 
    {
        return ar[row][col];
    }
}

/**
 * Your SubrectangleQueries object will be instantiated and called as such:
 * SubrectangleQueries obj = new SubrectangleQueries(rectangle);
 * obj.updateSubrectangle(row1,col1,row2,col2,newValue);
 * int param_2 = obj.getValue(row,col);
 */