public class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        int pairs = 0;
        
        for(int i=0;i<nums.length;i++) {
            int count = counts.getOrDefault(nums[i], 0);
            counts.put(nums[i], count+1);
            pairs += count;
        }
        
        return pairs;
    }
}
