class Solution {
    public int minOperations(int n) {
        int res = 0;
        if(n >= 3){
            int median = (2*(n/2)+1);
            for(int i=0;i<n;i++){
                res += Math.abs(median-((2*i)+1));
            }
            return res/2;
        }
        return n == 1? 0:1;
    }
}