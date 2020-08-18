class Solution {
    public int searchInsert(int[] nums, int target)
    {
       return binSearch(nums, 0, nums.length-1, target);  
    }
    
   int binSearch(int []a, int start, int end, int target){
       int output;
       int middle = (start+end)/2;
       
       if(start>end)
       {
           output = start;
       } // if
       else if(target == a[middle])
       {
           output = middle;
       }
       else
       {
           
           if(target < a[middle])
           output = binSearch(a, start, middle-1, target);
           else
           output = binSearch(a, middle+1, end, target);
       } // else
       
       return output;
   } // method
}