class Solution {
    public int minFlips(String target) {
        int res = 0;
        for(int i=0;i<target.length();i++){
            if(target.charAt(i) == '1' && res%2 == 0){
                res++;
            }else if(target.charAt(i) == '0' && res%2 != 0){
                res++;
            }
        }
        return res;
    }
}