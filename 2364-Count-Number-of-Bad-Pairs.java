class Solution {
    public long countBadPairs(int[] nums) {
        long good = 0,total =0;
        int n = nums.length;
        total = ((long) n*(n-1))/2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int val=nums[i]-i;
            good+=map.getOrDefault(val,0);
            map.put(val,map.getOrDefault(val,0)+1);
        }
        return total-good;
    }
}