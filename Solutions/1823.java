class Solution {
    public int findTheWinner(int n, int k) {
        if(n == 1){
            return n;
        }else{
            return (findTheWinner(n-1, k)+k-1)%n + 1;
        }
    }
}
