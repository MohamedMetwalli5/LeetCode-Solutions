class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] arr = new int[n];
        for(int i=0;i<bookings.length;i++){
            int first = bookings[i][0];
            int last = bookings[i][1];
            for (int j=first;j<=last;j++) {
                arr[j-1] += bookings[i][2];
            }
        }
        return arr;
    }
}
