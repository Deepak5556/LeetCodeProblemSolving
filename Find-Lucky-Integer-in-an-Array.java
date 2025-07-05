class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = -1;
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> j : map.entrySet()) {
            int a = j.getKey();
            int b = j.getValue();
            if (a == b) {
                ans = a;
            }
        }
        return ans;
    }
}