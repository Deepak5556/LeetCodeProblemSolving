class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int min = 0;
        int max = 0;
        int[]   mm = new int[n];
        int[]   mn = new int[n];
        for(int i =0;i<n ;i++)
        {
            min=Math.max(min,height[i]);
            mm[i]=min;
        }
        for(int i=n-1;i>=0;i--)
        {
            max=Math.max(max,height[i]);
            mn[i]=max;
        }
        int ans = 0;
        for(int i=0;i<n;i++)
        {
            ans+=Math.min(mm[i],mn[i])-height[i];
        }
        return ans;
    }
}