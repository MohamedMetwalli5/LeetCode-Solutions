class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] array = new int[2];
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++){
                if((numbers[i] + numbers[j] == target) && i != j){
                    array[0] = Math.min(i,j) + 1;
                    array[1] = Math.max(i,j) + 1;
                    return array;
                }
            }
        }
        
        return array;
    }
}