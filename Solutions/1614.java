class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int max = Integer.MIN_VALUE, counter = 0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                st.push('(');
                counter++;
            }else if(s.charAt(i) == ')'){
                st.pop();
                counter--;
            }
            if(counter > max){
                max = counter;
            }
        }
        return max;
    }
}