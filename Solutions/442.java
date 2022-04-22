class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(h.contains(nums[i])){
                l.add(nums[i]);                
            }else{
                h.add(nums[i]);
            }
        }
        return l;
    }
}