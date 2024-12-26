class Solution {
    public int findTargetSumWays(int[] nums, int target) {
          int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if (Math.abs(target) > sum) {
            return 0;
        }

        int[] dp = new int[2 * sum + 1];
        dp[sum] = 1; // Base case: one way to get sum 0 with 0 elements

        for (int num : nums) {
            int[] next = new int[2 * sum + 1];
            for (int i = 0; i < 2 * sum + 1; i++) {
                if (dp[i] > 0) {
                    next[i + num] += dp[i];
                    next[i - num] += dp[i];
                }
            }
            dp = next;
        }
        return dp[sum + target];
    }
}