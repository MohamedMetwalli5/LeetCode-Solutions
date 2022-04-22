class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> l = new ArrayList<>();
        HashMap<Character, Integer> last = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            last.put(s.charAt(i), i);
        }
        
        int start = 0, end = -1;
        for (int i=0;i<s.length();i++){ 
            end = Math.max(end, last.get(s.charAt(i)));
            if (end == i){
                int length = end-start+1;
                start = end + 1;
                l.add(length);
            }
        }
        
        return l;
    }
}