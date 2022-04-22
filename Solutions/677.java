class MapSum {

    HashMap<String, Integer> h;
    public MapSum() {
        h = new HashMap<>();
    }
    
    public void insert(String key, int val) {
        h.put(key, val);
    }
    
    public int sum(String prefix) {
        int sum = 0;
        for(String k : h.keySet()){
            if(k.startsWith(prefix)){
                sum += h.get(k);
            }
        }
        return sum;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */