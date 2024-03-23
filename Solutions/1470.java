class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] array = new int[2*n];
        int k = 0,j = 1;
        for(int i=0;i<nums.length;i++){
            if(i<(nums.length)/2){
                array[k] = nums[i];
                k += 2;
            }else{
                array[j] = nums[i];
                j += 2;
            }
        }
        return array;
        
    }
}