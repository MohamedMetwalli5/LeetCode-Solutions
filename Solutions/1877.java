class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int f=0, s=nums.length-1;
        int max = 0;
        while(f < s){
            max = Math.max(max, nums[f]+nums[s]);
            f++;
            s--;
        }
        
        return max;
    }
}
