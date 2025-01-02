class MyStack {
    Queue <Integer> Queue1;
    Queue <Integer> Queue2;

    public MyStack() {
                Queue1 = new LinkedList<>();
                Queue2 = new LinkedList<>();
    }
    
    public void push(int x) {
                Queue2.offer(x);
                while(!Queue1.isEmpty()){
                    Queue2.offer(Queue1.poll());
                }
                Queue<Integer> temp = Queue1;
                Queue1 = Queue2;
                Queue2 = temp;
}
    
    public int pop() {
        return Queue1.poll();
    }
    
    public int top() {
        return Queue1.peek();        
    }
    
    public boolean empty() {
        return Queue1.isEmpty();        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */