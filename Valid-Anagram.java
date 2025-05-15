class Solution {
    public boolean isAnagram(String s, String t) {
        char[] brr = t.toCharArray();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(brr);
        if(arr.length!=brr.length){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if(arr[i]!=brr[i]){
                return false;
            }
        }
        return true;
    }
}