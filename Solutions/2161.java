class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] res = new int[nums.length];
        int k = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] < pivot){
                res[k++] = nums[i];
            }
        }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] == pivot){
                res[k++] = nums[i];
            }
        }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] > pivot){
                res[k++] = nums[i];
            }
        }
        
        return res;
    }
}