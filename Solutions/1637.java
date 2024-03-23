class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] arr = new int[points.length] ;
        for( int i=0; i<points.length;i++){
            arr[i] = points[i][0] ;
        }
        Arrays.sort(arr);
        int ans=0 ;
        for( int i=0;i<arr.length-1;i++){
            int sum = arr[i+1]-arr[i] ;
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}