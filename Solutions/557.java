class Solution {
    public String reverseWords(String s) {
        String[] array = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i=0;i<array.length;i++){
            StringBuilder temp = new StringBuilder();
            temp.append(array[i]);
            result.append(temp.reverse());
            result.append(" ");
        }
        
        return result.toString().trim();
    }
}