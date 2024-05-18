class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();
        PriorityQueue<Pair<Integer,Integer>> minPQ = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        for(int i=0;i<nums.length;i++){
            int freq = h.getOrDefault(nums[i], 0) + 1;
            h.put(nums[i], freq);
        }
        for(HashMap.Entry<Integer, Integer> e : h.entrySet()){
            minPQ.add(new Pair(e.getKey(), e.getValue()));
            if(minPQ.size() > k){
                minPQ.remove();
            }
        }
        int[] res = new int[k];
        for(int i=0; i < k;i++){
            res[i] = minPQ.remove().getKey();
        }
        
        return res;
    }
}
