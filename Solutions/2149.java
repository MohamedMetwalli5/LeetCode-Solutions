class Solution {
    public int[] rearrangeArray(int[] nums) {
        int k = 0, j = 1;
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0){
                arr[k] = nums[i];
                k+=2;
            }else{
                arr[j] = nums[i];
                j+=2;
            }
        }

        return arr;
    }
}
