class Solution {
public:
    string removeStars(string s) {
        string str = "";
        
        for (char ch: s) {
            ch == '*'? str.pop_back(): str.push_back(ch);
        }
        
        return str;
    }
};