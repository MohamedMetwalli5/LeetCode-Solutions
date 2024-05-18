class Solution {
    public int kthSmallest(int[][] mat, int k) {
        int n = mat.length; 
        int m = mat[0].length;
        int low = mat[0][0], high = mat[n-1][m-1];
        while(low < high){
            int mid = low + (high-low)/2;
            int count = countSmaller(n, m, mid, mat);
            if(count < k){
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        
        return low;
    }
    
    int countSmaller(int n, int m, int target, int[][] mat){
        int count = 0;
        for(int j=m-1,i=0; i<n && j>=0; i++){
            if(mat[i][j] > target){
                i--;
                j--;
            }else{
                count += j+1;
            }
        }
        return count;
    }
}
