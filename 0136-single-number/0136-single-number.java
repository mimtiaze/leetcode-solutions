class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++)
            ans ^= nums[i];
        
        return ans;
    }
}

/*
Method: XOR
Time: 1ms
Memory: 41.9MB

class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++)
            ans ^= nums[i];
        
        return ans;
    }
}
*/

/*
Method: Sorting
Time: 6ms
Memory: 42.6MB
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        
        for (int i = 1; i < nums.length; i+=2)
            if (nums[i] != nums[i-1])
                return nums[i-1];
        
        return nums[nums.length - 1];
    }
}
*/

/*
Method: HashMap
Time: 9ms
Memory: 42.9MB

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            mp.merge(nums[i], 1, Integer::sum);
        
        for (Map.Entry<Integer, Integer> es: mp.entrySet()) {
            if (es.getValue() == 1) return es.getKey();
        }
        
        return -1;
    }
}
*/


/*
brute force:

for (i=0 -> n)
    found = false;
    for (j=i+1 -> n)
        if (nums[i] == nums[j])
            found  = true;
            break; 
    
    if (!found) return nums[i];

*/

/*
Map:

HashMap<Integer, Integer> mp = new HashMap<>();
for (i=0 -> n)
    mp.merge(nums[i], 1, Integer::sum);
for (Map.Entry<Integer, Integer> es: mp.entrySet())
    if (es.getValue() == 1) return es.getKey();
        
*/