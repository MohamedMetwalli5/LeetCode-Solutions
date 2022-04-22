class Solution {
    public int findTheWinner(int n, int k) {
        return n == 1? n : (findTheWinner(n-1, k)+k-1)%n+1; 
    }
}