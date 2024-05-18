class ProductOfNumbers {
    ArrayList<Integer> prefixProduct;

    public ProductOfNumbers() {
        prefixProduct = new ArrayList();
    }
    
    public void add(int num) {
        if(num == 0){
            prefixProduct.clear();
        }else{
            if(prefixProduct.size() == 0){
                prefixProduct.add(num);
            }else{
                prefixProduct.add(num * prefixProduct.get(prefixProduct.size()-1));
            }
        }
    }
    
    public int getProduct(int k) {
        if(k > prefixProduct.size()){
            return 0;
        }
        if(prefixProduct.size() == k){
            return prefixProduct.get(prefixProduct.size()-1);
        }
        return (prefixProduct.get(prefixProduct.size()-1) / prefixProduct.get(prefixProduct.size()-k-1));
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
