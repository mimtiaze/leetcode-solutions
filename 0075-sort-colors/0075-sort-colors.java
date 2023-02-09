class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        for (int t : nums) {
            mp.merge(t, 1, Integer::sum);
        }
        
        int index = 0;
        for (Map.Entry<Integer, Integer> tmp : mp.entrySet()) {
            for (int i = 0; i < tmp.getValue(); i++) {
                nums[index++] = tmp.getKey();
            }
        }
    }
}