class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> retList = new ArrayList<>();
        
        if (nums.length == 0) return retList;
        
        int savedValCount = 1;
        int savedValStart = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if ((nums[i-1] + 1) == nums[i]) {
                savedValCount++;
            } else {
                String str = "" + savedValStart;
                if (savedValCount > 1)
                    str = savedValStart + "->" + nums[i-1];
                
                retList.add(str);
                savedValCount = 1;
                savedValStart = nums[i];
            }
        }
        
        String str = "" + savedValStart;
        if (savedValCount > 1)
            str = savedValStart + "->" + nums[nums.length - 1];

        retList.add(str);
        
        return retList;
    }
}