class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set <Integer> st = new HashSet<>();
        Set <Integer> result = new HashSet<>();
        for(int i:nums1){
            st.add(i);
        }
        for(int i : nums2){
            if(st.contains(i)){
                result.add(i);
            }
        }

        int size = result.size();
        int arr[] = new int[size];
        int j=0;
        for(int i: result){
            arr[j++]=i;
        }
        return arr;
    }
}