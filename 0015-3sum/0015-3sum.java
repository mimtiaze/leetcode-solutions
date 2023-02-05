class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            if (i>0 && nums[i]==nums[i-1]) continue;
            
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                
                //System.out.println("i=" + i + " j=" + j + " k=" + k);
                //System.out.println("nums[i]=" + nums[i] + " nums[j]=" + nums[j] + " nums[k]=" + nums[k]);
                int sum = nums[i] + nums[j] + nums[k];
                //System.out.println("sum=" + sum);
                if (sum == 0) {
                    List<Integer> t = new ArrayList<>();
                    t.add(nums[i]);
                    t.add(nums[j++]);
                    t.add(nums[k--]);
                    set.add(t);
                }
                else if(sum > 0) k--;
                else j++;
            }
        }
        
        return new ArrayList<List<Integer>>(set);
    }
}

/*
Brute force:
for i=0 -> n
 for j=i+1 -> n
    for k=j+1 -> n
        if nums[i] + nums[j] + nums[k] == 0
            list.add({nums[i], nums[j], nums[k]});


Two pointer:
for i=0 -> n
    j=i+1, k=nums.length-1
    while (j<k)
        sum = nums[i] + nums[j] + nums[k]
        if sum == 0
            list.add({nums[i], nums[j++], nums[k--]});
        else if sum > 0 
            k--;
        else 
            j++;
        

*/