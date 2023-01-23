class Solution {
    public int findJudge(int n, int[][] trust) {
        if (n == 1) return 1;

        HashMap<Integer, Integer> mpTrust = new HashMap<>();
        HashMap<Integer, Integer> mpTo = new HashMap<>();
        for (int i = 0; i < trust.length; i++) {
            mpTrust.merge(trust[i][1], 1, Integer::sum);
            mpTo.put(trust[i][0], trust[i][1]);
        }
        
        for (Map.Entry<Integer, Integer> entry: mpTrust.entrySet()) {
            if (entry.getValue() >= n - 1 && mpTo.containsKey(entry.getKey()) == false) {
                return entry.getKey();
            } 
        }
        
        return -1;
    }
}