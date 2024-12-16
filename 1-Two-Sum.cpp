class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> res(2);
        for(int i=0;i<nums.size();i++)
        {
            for(int j=i;j<nums.size();j++){
                if(i!=j)
                {
                    if(nums[i]+nums[j]==target)
                    {
                        res[0]=i;
                        res[1]=j;
                        return res;
                    }
                }
            }
        }
       return res;  
    }
};