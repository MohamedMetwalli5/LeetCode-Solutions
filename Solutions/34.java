class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = findFirst(nums, target);
        res[1] = findLast(nums, target);
        return res;
    }
    
    private int findFirst(int[] nums, int target){
        int index = -1, low = 0, high = nums.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] >= target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
            if(nums[mid] == target){
                index = mid;
            }
        }
        return index;
    }

    private int findLast(int[] nums, int target){
        int index = -1, low = 0, high = nums.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] <= target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
            if(nums[mid] == target){
              index = mid;  
            } 
        }
        return index;
    }
    
}