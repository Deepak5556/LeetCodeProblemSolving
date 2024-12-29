class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int nn = n + m;
        int[] arr = new int[nn];

        for (int i = 0; i < n; i++) {
            arr[i] = nums1[i];
        }

        for (int j = 0; j < m; j++) {
            arr[n + j] = nums2[j];
        }

        Arrays.sort(arr);

        if (nn % 2 == 0) {
            return (arr[nn / 2 - 1] + arr[nn / 2]) / 2.0;
        } else {

            return arr[nn / 2];
        }
    }
}