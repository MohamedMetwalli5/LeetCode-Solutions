class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character, Integer> h = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(h.get(s.charAt(i)) == null){
                h.put(s.charAt(i), 1);
            }else{
                h.put(s.charAt(i), h.get(s.charAt(i))+1);
            }
        }
        int res = 0;
        for(int i=0;i<t.length();i++){
            if(h.get(t.charAt(i)) == null || h.get(t.charAt(i)) < 0){
                res++;
            }else{
                h.put(t.charAt(i), h.get(t.charAt(i))-1);
                if(h.get(t.charAt(i)) < 0){
                    res++;
                }
            }
        }
        return res;
    }
}