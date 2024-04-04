class Solution {
    public int maxDepth(String s) {
         int counter = 0, max = 0;  
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) == '(') {
                counter++;
            }else if(s.charAt(i) == ')') {
                counter--;
            }
            max = Math.max(counter, max);
        }
        return max;
    }
}
