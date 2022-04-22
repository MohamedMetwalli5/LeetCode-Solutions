class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> h = new HashMap<>();
        h.put(0, 1);
        int counter = 0, sum = 0;
        for(int i=0;i<nums.length;i++) {
            sum += nums[i];
            if(h.containsKey(sum-k)) {
                counter += h.get(sum-k);
            }
            int temp = h.getOrDefault(sum,0) + 1;
            h.put(sum,temp);
        }
        return counter;
    }
}