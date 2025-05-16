class MinStack {
    Stack<Integer> stk;
    Stack<Integer> minStk;
    public MinStack() {
        stk = new Stack<>();
        minStk = new Stack<>();
    }
    
    public void push(int val) { 
        stk.push(val);

        if(minStk.isEmpty() || val <= minStk.peek()) {
            minStk.push(val);
        }
    }
    
    public void pop() {
        int val = stk.pop();
        if(!minStk.isEmpty() && minStk.peek() == val) {
            minStk.pop();
        }
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return minStk.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */