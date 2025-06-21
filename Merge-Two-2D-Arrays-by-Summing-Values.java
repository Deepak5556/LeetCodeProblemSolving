class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        List<int[]> arr = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if(nums1[i][0] == nums2[j][0]){
                arr.add(new int[] {nums1[i][0], nums2[j][1] + nums1[i][1]});
                i++;
                j++;
            }
            else if(nums1[i][0] < nums2[j][0]){
                arr.add(nums1[i]);
                i++;
            }
            else{
                arr.add(nums2[j]);
                j++;
            }
        }
        while(i < n){
            arr.add(nums1[i]);
            i++;
        }
        while(j < m){
            arr.add(nums2[j]);
            j++;
        }
        return arr.toArray(new int[arr.size()][]);
    }
}
