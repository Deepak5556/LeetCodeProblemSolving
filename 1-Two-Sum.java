class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
           for(int j=i;j<n;j++)
           {
            int l=j-i;
             if(nums[l]+nums[j]==target)
             {
                return new int[] {l,j};
             }
           }
        }
        return new int[0];
                
    }
}