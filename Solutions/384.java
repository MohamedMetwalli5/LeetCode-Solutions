class Solution {
    private int[] original;
    public Solution(int[] nums) {
        original = new int[nums.length];
        for(int i=0;i<original.length;i++){
            original[i] = nums[i];
        }
    }
    
    public int[] reset() {
        return original;
    }
    
    public int[] shuffle() {
        int[] arr = new int[original.length];
        for(int i=0;i<arr.length;i++){
            arr[i] = original[i];
        }
        for(int i=0;i<arr.length;i++){
            int to = new Random().nextInt(arr.length-i)+i;
            int temp = arr[i];
            arr[i] = arr[to];
            arr[to] = temp;
        }
        return arr;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */