class Solution {
    public int balancedStringSplit(String s) {
        int counter = 0, max = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'L'){
                counter++;
            }else{
                counter--;
            }
            if(counter == 0){
                max++;
            }
        }
        
        return max;
    }
}