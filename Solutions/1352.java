class ProductOfNumbers {
    private List<Integer> l; 
    public ProductOfNumbers() {
        l = new ArrayList<>();
    }
    
    public void add(int num) {
        l.add(num);   
    }
    
    public int getProduct(int k) {
        int p = 1, i = l.size()-1;
        while(k-->0){
            p *= l.get(i);
            i--;
        }
        return p;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */