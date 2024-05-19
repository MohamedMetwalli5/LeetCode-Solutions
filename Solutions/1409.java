class Solution {
    public int[] processQueries(int[] queries, int m) {
        ArrayList<Integer> p = new ArrayList<>();
        for(int i=1;i<=m;i++){
            p.add(i);
        }
        int[] arr = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            arr[i] = p.indexOf(queries[i]);
            p.add(0, p.remove(p.indexOf(queries[i])));
        }
        return arr;
    }
}
