class Solution {
    public int findLength(int n) {
        int rev = 1;
        int rem = 1;
        int count = 0;
        while (n > 0) {
            count++;
            rev = n % 10;
            rem = (rem * 10) + rev;
            n = n / 10;
        }
        return count;
    }

    public int findNumbers(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int numlen = findLength(nums[i]);
            if (numlen % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}