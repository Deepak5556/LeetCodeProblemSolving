class Solution {
    public int count(int n, int s, int t) {
        return Math.abs(n - s) + t * 2;
    }

    public int maxDistance(String s, int k) {
        int north = 0;
        int south = 0;
        int east = 0;
        int west = 0;
        int ans = 0;
        for (char i : s.toCharArray()) {
            switch (i) {
                case 'N':
                    north++;
                    break;
                case 'S':
                    south++;
                    break;
                case 'E':
                    east++;
                    break;
                case 'W':
                    west++;
                    break;
            }
            int time1 = Math.min(Math.min(north, south), k);
            int time2 = Math.min(Math.min(east, west), k - time1);
            ans = Math.max(ans, count(north, south, time1) + count(east, west, time2));
        }
        return ans;
    }
}