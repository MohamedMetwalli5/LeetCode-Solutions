class Solution {
    public String restoreString(String s, int[] indices) {
        char[] array = new char[s.length()];
        for(int i=0;i<s.length();i++){
            array[indices[i]] = s.charAt(i);
        }
        String result  = new String(array);
        return result;
        
    }
}