class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1){
            return intervals;
        }    
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> result = new ArrayList<>();
        int[] current_interval = intervals[0];
        result.add(current_interval);
                       
        for(int[] interval : intervals){ 
            int current_first = current_interval[0];
            int current_last = current_interval[1];
            int next_first = interval[0];
            int next_last = interval[1];
            
            if(current_last >= next_first){
                current_interval[1] = Math.max(current_last,next_last);
            }else{
                current_interval = interval;
                result.add(current_interval);
            }
       }            
       return result.toArray(new int[result.size()][2]);
                       
    }
}