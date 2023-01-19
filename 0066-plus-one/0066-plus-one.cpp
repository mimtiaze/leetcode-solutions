class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        bool pushFront = false;
        for(int i=digits.size()-1;i>=0;i--){
            digits[i]++;
            if(digits[i]==10) {
                digits[i]=0;
                if(i==0)
                    pushFront = true;
            } else {
                break;
            }
        }
        
        if(pushFront){
            digits.push_back(0);
            digits[0]=1;
        }
        
        return digits;
        
    }
};