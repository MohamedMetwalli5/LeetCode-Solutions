class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> l = new HashSet<>();
        HashSet<String> h = new HashSet<>();
        for(int i=0;i<=s.length()-10;i++){
            String sequence = s.substring(i,i+10);
            if(!h.add(sequence)){
                l.add(sequence);
            }
        }
        return new ArrayList(l);
    }
}