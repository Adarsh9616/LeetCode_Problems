class Solution {
    public boolean canBeEqual(int[] target, int[] arr) 
    {
        if(target.length != arr.length) {
            return false;
        }
        
        int[] counterArray = new int[1001];
        for(int i = 0; i < target.length; i++) {
            counterArray[target[i]]++;
            counterArray[arr[i]]--;
        }
        
        for(int i = 0; i < counterArray.length; i++) {
            if(counterArray[i] != 0) {
                return false;
            }
        }
        
        return true;
        
    }
}