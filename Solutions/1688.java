class Solution {
    public int numberOfMatches(int n) {
        int sum = 0;
        while(n > 1){
            if(n%2 == 0){
                n /= 2;
                sum += n;
            }else{
                n /= 2;  
                sum += n+1;
            }
        }
        
        return sum;
    }
}