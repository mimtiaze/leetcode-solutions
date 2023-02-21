class Solution {
    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) return nums[0];
        
        for (int i = 1; i < nums.length; ){
            if(nums[i] == nums[i-1]){
                i += 2;
            } else {
                return nums[i-1];
            }
        }
        
        return nums[nums.length - 1]; 
    }
}