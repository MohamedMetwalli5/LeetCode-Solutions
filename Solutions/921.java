class Solution {
    public int minAddToMakeValid(String str) {
        int res = 0;
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '('){
                s.push('(');
            }else{
                if(!s.isEmpty()){
                    s.pop();
                }else{
                    res++;
                }
            }
        }
        return res+s.size();
    }
}