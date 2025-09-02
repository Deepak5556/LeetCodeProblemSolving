class Solution {
    public int scoreOfString(String s) {
        int[] arr = new int[s.length()];
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            arr[i]=(int)s.charAt(i);
        }
        for(int i=0;i<arr.length-1;i++){
            ans += Math.abs(arr[i]-arr[i+1]);
        }
        return ans;
    }
}