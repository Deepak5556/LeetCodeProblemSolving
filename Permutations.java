class Solution {

    public static void per(int[] nums, ArrayList<Integer> res, Set<List<Integer>> lst) {
        int n = nums.length;
        if (n == res.size()) {
            lst.add(new ArrayList<>(res));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!res.contains(nums[i])) {
                res.add(nums[i]);
                per(nums, res, lst);
                res.remove(res.size() - 1);
            }
        }

    }

    public List<List<Integer>> permute(int[] nums) {
        Set<List<Integer>> lst = new HashSet<>();
        per(nums, new ArrayList<>(), lst);
        return new ArrayList<>(lst);
    }
}