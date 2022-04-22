class Solution {
    public int triangularSum(int[] nums) {
        int size = nums.length;
        while(size >= 2){
            for(int i=0;i<size-1;i++){
                nums[i] = (nums[i] + nums[i+1])%10;
            }
            size--;
        }
        
        return nums[0];
    }
}