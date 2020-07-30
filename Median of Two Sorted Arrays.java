class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        double median = 0.0;
		int i = 0, j = 0, k = 0;
		int arr[] = new int[nums1.length + nums2.length];
		while (i < nums1.length && j < nums2.length) // Merge the Sorted Array
			arr[k++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
		while (i < nums1.length)
			arr[k++] = nums1[i++];
		while (j < nums2.length)
			arr[k++] = nums2[j++];
		if (arr.length % 2 == 0) { // Median in an Even Length Array
			median = arr[arr.length / 2 - 1] + arr[arr.length / 2];
			median = median / 2;
		} else // Median in an Odd Length Array
			median = arr[arr.length / 2];
		return median;
    }
}