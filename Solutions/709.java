class Solution {
    public String toLowerCase(String str) {
        StringBuilder s = new StringBuilder();
        for(int i=0;i<str.length();i++){
            s.append(Character.toLowerCase(str.charAt(i)));
        }
        
        return s.toString();
    }
}