class Solution {
    public int[] sumZero(int n) {
        int arr[] = new int[n];
        int left = 0;
        int right = n - 1;
        int temp = n / 2;
        while (left < right) {
            arr[left] = temp;
            arr[right] = -temp;
            left++;
            temp--;
            right--;
        }
        return arr;
    }
}