class Solution {
public:
    char nextGreatestLetter(vector<char>& letters, char target) {
        if(target >= letters[letters.size()-1])
            return letters[0];
        
        for(char ch: letters){
            if(ch > target)
                return ch;
        }
        
        return target;
    }
};