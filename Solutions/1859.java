class Solution {
    public String sortSentence(String s) {
        HashMap<Integer, String> h = new HashMap<>();
        String[] str = s.split(" ");
        String res = "";
        for(int i=0;i<str.length;i++){
            int j=0;
            while(!Character.isDigit(str[i].charAt(j))){
                j++;
            }
            h.put(Integer.parseInt(str[i].substring(j)), str[i].substring(0,j));
        }
        for(int i=1;i<=str.length;i++){
            res += (h.get(i) + " ");
        }
        return res.trim();
        
    }
}