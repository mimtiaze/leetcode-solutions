class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        Stack<Integer> stk = new Stack<>();
        
        int[] ret = new int[nums1.length];
        
        for (int t: nums2) {
            while (!stk.isEmpty() && stk.peek() < t) {
                mp.put(stk.pop(), t);
            }
            stk.push(t);
        }
        
        for (int i = 0; i < nums1.length; i++) {
            ret[i] = mp.getOrDefault(nums1[i], -1);
        }
        
        
        return ret;
        
    }
}