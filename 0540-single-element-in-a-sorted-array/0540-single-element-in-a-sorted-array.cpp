class Solution {
public:
    int singleNonDuplicate(vector<int>& nums) {
        if(nums.size()==1) return nums[0];
        
        for(int i=1;i<nums.size();){
            if(nums[i]==nums[i-1]){
                i+=2;
            } else {
                return nums[i-1];
            }
        }
        
        return nums[nums.size()-1];
    }
};