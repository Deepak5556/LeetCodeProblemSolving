class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return Math.max( nums[n-1]*nums[n-2]*nums[n-3] , nums[0]*nums[1]*nums[n-1] );
        //3*2*1 = 6  1*2*3 = 6
        //4*3*2  = 24 1*2*3 = 6
        //-3*-2*-1 = -6 -1*-2*-3 = -6
    }
}