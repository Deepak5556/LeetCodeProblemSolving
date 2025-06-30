class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
        for (int i : nums) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> mp.get(b) - mp.get(a));
        pq.addAll(mp.keySet());
        int[] arr = new int[k];

        for (int i = 0; i < k; i++) {
            arr[i] = pq.poll();
        }
        return arr;
    }
}