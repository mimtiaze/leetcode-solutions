class Solution {
public:
    int lastStoneWeight(vector<int>& stones) {
        priority_queue<int> pq;
        for (int t : stones)
            pq.push(t);
        
        int len = pq.size();
        while (len > 1) {
            int t1 = pq.top();
            pq.pop();
            int t2 = pq.top();
            pq.pop();
            pq.push(abs(t1-t2));
            len = pq.size();
        }
        
        return pq.top();
    }
};