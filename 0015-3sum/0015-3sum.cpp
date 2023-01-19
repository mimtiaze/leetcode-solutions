class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        int n = nums.size();
        set<vector<int>> sett;
        sort(nums.begin(), nums.end());
        
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j=i+1;
            int k=n-1;
            
            while(j<k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0)
                    //res.push_back({nums[i], nums[j++], nums[k--]});
                    sett.insert({nums[i], nums[j++], nums[k--]});
                else if(sum > 0) k--;
                else j++;
            }
        }
        
        vector<vector<int>> res(sett.begin(), sett.end());
        return res;
    }
};