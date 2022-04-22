class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int res = 0, k = 0, n = piles.length/3;
        for(int i=piles.length-2;i>=0 && k<n;i-=2){
            res += piles[i];
            k++;
        }
        
        return res;
    }
}