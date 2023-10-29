// Mathmetical
// Took help from discussion tab
class Solution {
public:
    int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        return ceil(log(buckets) / log(minutesToTest / minutesToDie + 1));
    }
};