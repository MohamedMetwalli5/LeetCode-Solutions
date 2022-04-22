class StockSpanner {

    Stack<Pair<Integer, Integer>> stack;
    
    public StockSpanner() {
        stack = new Stack<>();
    }
    
    public int next(int price) {
        int span = 1;

        while(!stack.isEmpty() && stack.peek().getKey() <= price){
            span += stack.pop().getValue();
        }
        
        stack.add(new Pair<>(price, span));
        return span;    
    }
}
