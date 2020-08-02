class Solution {
    public int[] intersect(int[] nums1, int[] nums2) 
    {
         ArrayList<Integer> arr= new ArrayList<Integer>();
    	Arrays.sort(nums1); Arrays.sort(nums2);
        int i=0, j=0;
        
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]==nums2[j])
            {                
                arr.add(nums1[i]);
                i++; j++; 
            }
            else if(nums1[i]> nums2[j])
                j++;
            else
                i++;
        }
        
    	int[] res= new int[arr.size()];
    	for(int k=0;k <res.length; k++)
    		res[k]=arr.get(k);
    	return res;
        
    }
}