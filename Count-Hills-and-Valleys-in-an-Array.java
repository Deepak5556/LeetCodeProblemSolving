class Solution {
    public int[] changetoArray(List<Integer> lst) {
        int n = lst.size();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = lst.get(i);
        }
        return arr;
    } 
    public int countHillValley(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        int n = nums.length;
        if (n > 1) {
            lst.add(nums[0]);
        }
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] != nums[i]) {
                lst.add(nums[i]);
            }
        }
        int count = 0;
        int[] arr = changetoArray(lst);
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                count++;
            } else if (arr[i - 1] > arr[i] && arr[i] < arr[i + 1]) {
                count++;
            }
        }
        return count;
    }
}