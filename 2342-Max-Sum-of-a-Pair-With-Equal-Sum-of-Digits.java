class Solution {
    static int check(int nums){
        int rev =0;
        while(nums!=0)
        {
            rev += nums%10;
            nums=nums/10;
        }
        return rev;
    }
    public int maximumSum(int[] nums) {
      HashMap<Integer , Integer> map = new HashMap<>();
      int max=-1;
      int n = nums.length;
      int ck = 0;
      for(int i=0;i<n;i++){
        ck = check(nums[i]);
        if(map.containsKey(ck))
        {
            max = Math.max(max,map.get(ck)+nums[i]);
            map.put(ck,Math.max(map.get(ck),nums[i]));
        }
        else{
            map.put(ck,nums[i]);
        }
      }
        return  max;
    }
}