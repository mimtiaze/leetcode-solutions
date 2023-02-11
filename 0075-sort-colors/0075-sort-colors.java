class Solution {
    public void sortColors(int[] nums) {
        int[] colors = new int[3];
        
        for (int t : nums) {
            colors[t]++;
        }
        
        int colorIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (colors[colorIndex] > 0) {
                nums[i] = colorIndex;
                colors[colorIndex]--;
            }
            else {
                i--;
                colorIndex++;
            }
                
        }
    }
}


/*
Method: HashMap
Time: 1ms

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

*/