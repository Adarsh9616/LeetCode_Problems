class Solution {
    public int findSpecialInteger(int[] arr) 
    {
 int max = arr.length / 4;
        
        int i = 0;
        
        while(i < arr.length) {
            int num = arr[i];
            if(i + max < arr.length && arr[i + max] == num) {
                return num;
            }
            while(arr[i] == num){
                i++;
            }
        }
        
        return 1;
    }
}