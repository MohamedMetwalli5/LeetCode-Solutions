class Solution {
    public int countKDifference(int[] nums, int k) {
        Map<Integer,Integer> h = new HashMap<>();
        int res = 0;
        for(int i = 0;i< nums.length;i++){
            if(h.containsKey(nums[i]-k)){
                res += h.get(nums[i]-k);
            }
            if(h.containsKey(nums[i]+k)){
                res += h.get(nums[i]+k);
            }
            h.put(nums[i], h.getOrDefault(nums[i],0)+1);
        }
        
        
        return res;
    }
}