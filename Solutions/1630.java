class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> arr = new ArrayList<>();
        for(int i=0;i<l.length;i++){
            arr.add(Check(nums,l[i],r[i]));
        }
        return arr;
    }
    
    private static boolean Check(int[] nums, int from, int to){
        int[] temp = new int[to-from+1];
        for(int i=from;i<=to;i++){
            temp[i%(to-from+1)] = nums[i];
        }
        Arrays.sort(temp);
        int value = temp[1] - temp[0];
        for(int i=2;i<temp.length;i++){
            if(temp[i]-temp[i-1] != value){
                return false;
            }
        }
        return true;
    }
}