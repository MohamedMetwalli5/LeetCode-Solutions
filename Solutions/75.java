class Solution {
    public boolean checkPossibility(int[] nums) {
        if(nums.length == 1){
            return true;
        }    
        int min = nums[nums.length-1], max = nums[0], mincount = 0, maxcount = 0;
        int i = 0; int j = nums.length-1;
        while(i < nums.length){
            if(nums[i] >= max)
                max = nums[i];
            else
                maxcount++;
            if(nums[j] <= min)
                min = nums[j];
            else
                mincount++;
            i++; 
            j--;
        }
        return Math.min(maxcount,mincount) <= 1;
    }
}