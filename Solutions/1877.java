class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int first=0, second=nums.length-1;
        int max = 0;
        while(first < second){
            max = Math.max(max, nums[first]+nums[second]);
            first++;
            second--;
        }
        
        return max;
    }
}
