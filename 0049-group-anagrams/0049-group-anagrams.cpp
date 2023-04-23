class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>> ret;
        int index = 0;
        unordered_map <string, int> mp;

        for(string str: strs) {
            string tmp = str;
            sort(str.begin(), str.end());
            //cout << tmp << " " << str << endl;
            if (mp.count(str)) {
                ret[mp[str]].push_back(tmp);
            } else {
                mp[str] = index++;
                ret.push_back({tmp});
            }
        }

        return ret;
    }
};