class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l = new ArrayList<>();
        int n = nums.length/3;
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!h.containsKey(nums[i])){
                h.put(nums[i], 1);
            }else{
                h.put(nums[i], h.get(nums[i])+1);
            }
        }
        for(Integer k : h.keySet()){
            if(h.get(k) > n){
                l.add(k);
            }
        }
        
        return l;
    }
}