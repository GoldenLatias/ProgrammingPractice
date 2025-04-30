class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int[] merged = new int[nums1.length + nums2.length];
        for (int k = 0; k < merged.length; k++) {
            if (i == nums1.length) {
                merged[k] = nums2[j++];
            } else if (j == nums2.length) {
                merged[k] = nums1[i++];
            } else if (nums1[i] >= nums2[j]) {
                merged[k] = nums2[j++];
            } else {
                merged[k] = nums1[i++];
            }
        }
        double index = (merged.length-1) / 2.0;
        return (merged[(int) Math.floor(index)] + merged[(int) Math.ceil(index)]) / 2.0;
    }
}