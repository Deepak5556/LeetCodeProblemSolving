class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0)
            {
                arr[j]=nums[i];
                j++;
            }
        }
        for(int i=j;i<n;i++)
        {
            arr[i]=0;
        }
        for(int i=0;i<n;i++)
        {
            nums[i]=arr[i];
        }
    }
}