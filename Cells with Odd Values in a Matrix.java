class Solution {
    public int oddCells(int n, int m, int[][] indices) 
    {
        int cntOdd = 0;
        int[] rows = new int[n];
        int[] cols = new int[m];
        for(int i = 0; i < indices.length ;i++){
            ++rows[indices[i][0]];
            ++cols[indices[i][1]];
        }
        for(int i=0; i< n ;i++){
            for(int j = 0; j< m; j++){
                if((rows[i] + cols[j])%2 != 0){
                    cntOdd++;
                }
            }
        }
        return cntOdd;
    }
}