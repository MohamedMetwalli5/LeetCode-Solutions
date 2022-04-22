class Solution {
    
    public boolean CyclicChecker(List<Integer>[] adj, int[] visited, int vertex){
        if(visited[vertex] == 1){
            return false;
        }else if(visited[vertex] == 2){
            return true;
        }
        
        visited[vertex] = 1;
        for(int x : adj[vertex]){
            if(CyclicChecker(adj, visited ,x) == false){
                return false;
            }
        }
        visited[vertex] = 2;
        return true;
    }
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] l = new ArrayList[numCourses];
        for(int i=0;i<l.length;i++){
            l[i] = new ArrayList<>();
        }
        
        for(int[] elem : prerequisites){
            l[elem[0]].add(elem[1]);
        }
        int[] visited = new int[numCourses];
        for(int i = 0; i< numCourses; ++i){
            if((visited[i] == 0) && (CyclicChecker(l, visited, i) == false)){
                return false;
            }
        }
        
        return true;
    }
}