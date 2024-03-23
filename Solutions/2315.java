class Solution {
    public int countAsterisks(String s) {
        boolean insidePipeFlag = false;
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '|'){
                insidePipeFlag = !insidePipeFlag;
            }
            if(s.charAt(i) == '*' && !insidePipeFlag){
                count++;
            }
        }
        return count;
    }
}