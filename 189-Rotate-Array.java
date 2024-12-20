class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(k<1)return ;
        k=k%n;
        int[]temp=new int[n];
        int j=0;
        
        for(int i=0;i<k;i++)
        {
            temp[i]=nums[n-k+i];
        }
        for(int i=n-k-1;i>=0;i--)
        {
            temp[i+k]=nums[i];
        }
        for(int i=0;i<n;i++)
        {
            nums[i]=temp[i];
        }
    }
}