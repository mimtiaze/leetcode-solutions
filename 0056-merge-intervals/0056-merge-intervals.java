class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> 
            (a[0]==b[0])? a[1] - b[1]: a[0] - b[0]
        );
        LinkedList<int[]> list = new LinkedList<>();
        
        for (int[] t : intervals) {
            //System.out.println(t[0] + " " + t[1]);
            if (list.isEmpty() || list.getLast()[1] < t[0])
                list.add(t);
            else
                list.getLast()[1] = Math.max(list.getLast()[1], t[1]);
        }
        
        
        return list.toArray(new int[list.size()][]);
        
        
    }
}