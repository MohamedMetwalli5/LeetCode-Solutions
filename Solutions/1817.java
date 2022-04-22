class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] res = new int[k];
        Map<Integer, HashSet<Integer>> h = new HashMap<>();
        for(int i=0;i<logs.length;i++){
            h.putIfAbsent(logs[i][0], new HashSet<Integer>());
            h.get(logs[i][0]).add(logs[i][1]);
        }
        for(Integer t : h.keySet()){
            res[h.get(t).size()-1]++;
        }
        return res;
    }
}