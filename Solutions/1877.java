class Solution {
    public int minPairSum(int[] nums) {
        int max = Integer.MIN_VALUE;
        int[] reverse = new int[nums.length];
        for(int i=0;i<reverse.length;i++){
            reverse[i] = nums[i];
        }
        Arrays.sort(nums);
        Arrays.sort(reverse);
        for(int i=0;i<nums.length;i++){
            if(nums[i]+reverse[reverse.length-i-1] > max){
                max = nums[i]+reverse[reverse.length-i-1];
            }
        }
        return max;
    }
}