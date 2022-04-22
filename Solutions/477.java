class Solution {
    public int totalHammingDistance(int[] nums) {
        int sum = 0;
        for (int i=0;i<32;i++) {
            int one_count = 0;
            for (int j=0;j<nums.length;j++) {
                one_count += (nums[j] >> i) & 1;
            }
            sum += (one_count*(nums.length - one_count));
        }
        return sum;
    }
}