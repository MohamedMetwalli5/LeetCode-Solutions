class MyCalendar {

    private HashMap<Integer, Integer> h;
    
    public MyCalendar() {
        h = new HashMap<>();
    }
    
    public boolean book(int start, int end) {
        for(Integer k : h.keySet()){
            if(!(end <= k || start >= h.get(k))){
               return false; 
            }
        }
        h.put(start, end);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */