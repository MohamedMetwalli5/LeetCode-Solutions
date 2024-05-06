class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int[] arr = new int[nums.length*(nums.length+1)/2];
        int k = 0;
        for(int i=0;i<nums.length;i++){
            arr[k++] = nums[i];
            int last = nums[i];
            for(int j=i+1;j<nums.length;j++){
                arr[k++] += (last+nums[j]);
                last = arr[k-1];
            }        
        }
        Arrays.sort(arr);
        int sum = 0;
        for(int i=left-1;i <= right-1;i++){
            sum = (sum+arr[i])%(int)(Math.pow(10,9)+7);
        }
        
        return sum;
    }
    
    
}
