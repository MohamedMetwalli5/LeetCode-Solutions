class Solution {
    public int numOfPairs(String[] nums, String target) {
        int counter = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i != j && (nums[i]+nums[j]).equals(target)){
                   counter++; 
                }
            }   
        }
        
        return counter;
    }
}