class Solution {
    
    PriorityQueue<Pair<int[], Integer>> pq;
    Set<Integer> visited;
    
    public void getTheDistances(int[][] points, int index){
        for(int i=0; i<points.length;i++){
            if((i != index) && (visited.contains(i) == false)){
                int[] s = new int[]{index, i};
                int distance = Math.abs(points[i][1] - points[index][1]) + Math.abs(points[i][0] - points[index][0]);
                Pair<int[], Integer> p = new Pair<>(s, distance);
                pq.add(p);
            }
        }
    }
    
    public int minCostConnectPoints(int[][] points) {
        visited = new HashSet<>();
        pq = new PriorityQueue<>((a,b) -> (a.getValue() - b.getValue()));
        visited.add(0);
        getTheDistances(points,0);
        int count = 0;
        int min = 0;

        while(count != (points.length-1)){
            Pair<int[], Integer> p = pq.poll();
            int[] k = p.getKey();
            int value = p.getValue();
            int point = k[1];
            if(visited.contains(point)){
                continue;
            }
            min += value;
            count += 1;
            visited.add(point);
            getTheDistances(points, point);
        }
                                 
        return min;    
    }
    
}