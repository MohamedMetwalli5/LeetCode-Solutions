class RandomizedSet {

    private HashSet<Integer> s;
    
    public RandomizedSet() {
        s = new HashSet<>();
    }
    
    public boolean insert(int val) {
        if(!s.contains(val)){
            s.add(val);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if(s.contains(val)){
            s.remove(val);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        int random = new Random().nextInt(s.size());
        int count = 0;
        for(Integer in : s){
            if(count == random){
                return in;
            }
            count++;
        }
        return 0;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */