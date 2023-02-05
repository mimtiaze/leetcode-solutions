class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = nums[0];
        
        for (int num : nums) {
            if (count == 0) 
                candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        
        return candidate;
    }
}

/*
Method: Boyer-Moore Voting Algorithm
Time: 1ms
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = nums[0];
        
        for (int num : nums) {
            if (count == 0) 
                candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        
        return candidate;
    }
}


Method: Map
Time: 34ms
class Solution {
public:
    int majorityElement(vector<int>& nums) {
        map<int,int> mp;
        for(auto c: nums)
            mp[c]++;
        
        int ret = nums[0];
        int threshold = nums.size()/2;
        for(auto c: mp)
            if(c.second>threshold)
                ret = c.first;
        return ret;
    }
};
*/