class Solution {
    public int[] decompressRLElist(int[] nums) {
        int arrSize = 0;
        for (int i=0; i<nums.length;i+=2) {
            arrSize += nums[i];
        }
        
        int[] res = new int[arrSize];

        int startIndex = 0;
        for (int i=0;i<nums.length;i+=2) {
            Arrays.fill(res, startIndex, startIndex + nums[i], nums[i+1]);
            startIndex += nums[i];
        }
        return res;
    }
}