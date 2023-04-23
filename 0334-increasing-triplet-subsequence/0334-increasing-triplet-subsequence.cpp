class Solution {
public:
    bool increasingTriplet(vector<int>& nums) {
        int n = nums.size();
        if (n < 3) return false;

        int mid, left;
        mid = left = INT_MAX;

        for (int t: nums) {
            if (t > mid) return true;
            if (t > left && t < mid) mid = t;
            if (t < left) left = t;
        }

        return false;
    }
};