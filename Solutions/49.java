class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<List<String>>();
        HashMap<String, List<String>> h = new HashMap<>();
        for(int i=0; i < strs.length;i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if(h.get(sorted) == null){
                h.put(sorted, new ArrayList<>());
            }
            h.get(sorted).add(strs[i]);
        }
        for (Map.Entry<String, List<String>> entry : h.entrySet()) {
            res.add(entry.getValue());
        }

        return res;
    }
}
