class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] res = new int[k][points[0].length];
        HashMap<Double, Set<int[][]>> h = new HashMap<>();
        double[] distance = new double[points.length];
        for(int i=0;i<points.length;i++){
            distance[i] = Math.sqrt(points[i][0]*points[i][0] + points[i][1]*points[i][1]);
            if (!h.containsKey(distance[i])) {
                h.put(distance[i], new HashSet<>());
            }
            h.get(distance[i]).add(new int[][]{{points[i][0], points[i][1]}});
            
        }
        
        Arrays.sort(distance);
        
        int w = 0;
        for(int i=0;i<k;i++){
            int flag = 0;
            for(int[][] s : h.get(distance[i])){
                res[w][0] = s[0][0];
                res[w++][1] = s[0][1];
                // System.out.println(s[0][0] + ", " + s[0][1]);
                if(flag == 1){
                    i++;   
                }else{
                    flag = 1;
                }
            }
        }
        
        return res;
    }
}