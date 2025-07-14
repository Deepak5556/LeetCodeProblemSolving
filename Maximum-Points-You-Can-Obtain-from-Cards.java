class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int max = 0;
        if (cardPoints.length == k) {
            for (int i : cardPoints) {
                max += i;
            }
            return max;
        }
        if (k == 0)
            return 0;
        int left = k;
        int right = cardPoints.length- 1;
        int lsum = 0;
        for (int i = 0; i < k; i++) {
            lsum += cardPoints[i];
        }
        max = lsum;
        int rsum = 0;
        int n = cardPoints.length;
        for (int i = 0; i < k; i++) {
            lsum -= cardPoints[k-1-i];
            rsum += cardPoints[n-1-i];
            max = Math.max(max , lsum+rsum);
        }
        return max;
    }
}