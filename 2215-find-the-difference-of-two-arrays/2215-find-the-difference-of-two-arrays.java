class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> mp1 = new HashMap<>();
        HashMap<Integer, Integer> mp2 = new HashMap<>();
        
        for (int t : nums1) {
            mp1.put(t, t);
        }
        
        for (int t : nums2) {
            mp2.put(t, t);
        }
        
        //mp1.forEach((k, v) -> System.out.println(k));
        
        List<List<Integer>> ret = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int t: nums1) {
            if (!mp2.containsKey(t)) {
                set.add(t);
            }
        }
        //list.forEach((k) -> System.out.print(k + " ")); System.out.println();
        for (int t: set) list.add(t);
        ret.add(list);
        
        list = new ArrayList<>();
        set = new HashSet<>();
        for (int t: nums2) {
            if (!mp1.containsKey(t)) {
                set.add(t);
            }
        }
        //list.forEach((k) -> System.out.print(k + " ")); System.out.println();
        for (int t: set) list.add(t);
        ret.add(list);
        
        return ret;
    }
}