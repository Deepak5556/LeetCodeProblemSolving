class Solution {
    public int majorityElement(int[] nums) {
        int cand = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                cand = nums[i];
                count = 1; // Initialize count to 1 when a new candidate is chosen
            } else if (cand == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return cand;
    }
}
