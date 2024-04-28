class Solution {
    public int minAddToMakeValid(String str) {
        char[] arr = str.toCharArray();
        int open = 0, counter = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == '('){
                open++;
            }else if(arr[i] == ')'){
                if(open > 0){
                    open--;
                }else {
                    counter++;
                }
            }
        }

        return counter+open;
    }
}
