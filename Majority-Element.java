class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int number = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                number = nums[i];
                count++;
            } else if (number == nums[i]) {
                count++;
            } else {
                count--;
            }

        }
            return number;
    }
}