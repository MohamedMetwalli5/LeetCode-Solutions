class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i] == nums[i+1]){
                return nums[i];
            }
        }
        return nums[0];
    }
}