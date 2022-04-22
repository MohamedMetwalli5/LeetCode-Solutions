class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> h = new HashMap<>();
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<groupSizes.length;i++){
            h.putIfAbsent(groupSizes[i], new ArrayList<Integer>());
            h.get(groupSizes[i]).add(i);
            if(h.get(groupSizes[i]).size() >= groupSizes[i]){
                res.add(h.get(groupSizes[i]));
                h.put(groupSizes[i], new ArrayList<Integer>());
            }
            
        }
        
        // for(Integer k : h.keySet()){
        //     System.out.println(h.get(k));
        // }
        
        return res;
    }
}