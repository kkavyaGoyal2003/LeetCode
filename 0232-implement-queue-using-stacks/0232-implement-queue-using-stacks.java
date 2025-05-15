class MyQueue {
    Stack<Integer> enque;
    Stack<Integer> deque;

    public MyQueue() {
        enque = new Stack<>();
        deque = new Stack<>();

    }
    
    public void push(int x) {
        enque.push(x);
    }
    
    public int pop() {
        if(deque.isEmpty()) {
            while(!enque.isEmpty()) {
                deque.push(enque.pop());
            }
        }
        return deque.pop();
    }
    
    public int peek() {
        if(deque.isEmpty()) {
            while(!enque.isEmpty()) {
                deque.push(enque.pop());
            }
        }
        return deque.peek();
    }
    
    public boolean empty() {
        return (enque.isEmpty() && deque.isEmpty());
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */