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

/*
Time: 6 ms
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ret = new int[nums1.length];
        
        for (int i = 0; i < nums1.length; i++) {
            
            ret[i] = -1;
            boolean found = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    //System.out.println(nums1[i] + " == " + nums2[j]);
                    found = true;
                }
                
                if (found && nums1[i] < nums2[j]) {
                    //System.out.println(nums1[i] + " < " + nums2[j]);
                    ret[i] = nums2[j];
                    break;
                }
            }
            
        }
        
        return ret;
    }
}

*/