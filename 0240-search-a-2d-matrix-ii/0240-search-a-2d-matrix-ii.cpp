class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int m = matrix.size();
        if(m==0) return false;
        int n = matrix[0].size();
        
        int i = 0, j = n-1;
        while(i<m && j>=0) {
            int temp = matrix[i][j];
            if(temp==target)
                return true;
            else if(temp>target)
                j--;
            else
                i++;
        }
        
        return false;
    }
};