class Solution {

    private int[] arr;
    private HashMap<Integer, List<Integer>> h;
    
    public Solution(int[] nums) {
        arr = new int[nums.length];
        h = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[i];
            if(h.get(nums[i]) == null){
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                h.put(nums[i], temp);
            }else{
                List<Integer> temp = h.get(nums[i]);
                temp.add(i);
                h.put(nums[i], temp);
            }
        }
    }
    
    public int pick(int target) {
        return h.get(target).get(new Random().nextInt(h.get(target).size()));
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */