class CustomStack {

    private int[] arr;
    private int index = 0;
    
    public CustomStack(int maxSize) {
        arr = new int[maxSize];
    }
    
    public void push(int x) {
        if(index < this.arr.length){
            this.arr[index] = x;
            index++;   
        }
    }
    
    public int pop() {
        if(index == 0){
            return -1;
        }
        index--;
        return this.arr[index];
    }
    
    public void increment(int k, int val) {
        for(int i=0;i<Math.min(k, index);i++){
            this.arr[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */