class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> l = new ArrayList<>();
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(h.get(nums[i]) == null){
                h.put(nums[i], 1);
            }else{
                h.put(nums[i], h.get(nums[i])+1);
            }
        }
        int[] temp = new int[h.size()];
        int z = 0;
        for(Integer i : h.keySet()){
            temp[z++] = h.get(i);
        }
        Arrays.sort(temp);
        int[] res = new int[k];
        z = 0;
        for(Integer i : h.keySet()){
            if(z < res.length){
                for(int j=temp.length-1;j>=temp.length-k;j--){
                    if(h.get(i) == temp[j]){
                        res[z++] = i;
                        break;
                    }
                }
            }else{
                break;
            }
        }
        return res;
    }
}