class Solution {
    public int minSwaps(int[][] grid) {
        int[] lastZeros = new int[grid.length];
        
        for (int i = 0; i < grid.length; i++) {
            int cnt = 0;
            for (int j = grid.length - 1; j >= 0; j--) {
                if (grid[i][j] != 0) {
                    break;
                } 
                cnt++;
            }
            lastZeros[i] = cnt;
        }
        
        int swaps = 0;
        
        for (int i = 0; i < lastZeros.length; i++) {
            boolean hit = false;
            for (int j = i; j < lastZeros.length; j++) {
                if (lastZeros[j] >= lastZeros.length - 1 -i) {
                    hit = true;
                    for (int k = j; k > i; k--) {
                        int tmp = lastZeros[k];
                        lastZeros[k] = lastZeros[k - 1];
                        lastZeros[k - 1] = tmp;
                        swaps++;
                    }
                    break;
                }
            }
            if (!hit) {
                return -1;
            }
        }
        
        return swaps;
    }
}