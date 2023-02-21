class Solution {
    public int lastRemaining(int n) {
        int result;
        if (n == 1) {
            result = 1;
        } else {
            int temp = lastRemaining(n / 2);
            result = 2 * (1 + n / 2 - temp);
        }
        return result; 
    }
}