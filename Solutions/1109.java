class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] arr = new int[n];
        for(int[] b: bookings) {
            arr[b[0]-1] += b[2];
            if(b[1] < n){
                arr[b[1]] -= b[2];
            }
        }
        
        for(int i=1;i < n;i++) {
            arr[i] += arr[i-1];
        }

        return arr;
    }
}
