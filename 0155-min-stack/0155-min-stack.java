class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> mins = new Stack<>();
    public MinStack() {  
    }

    public void push(int val) {
        st.push(val);

        if(mins.isEmpty()||val<=mins.peek()){
            mins.push(val);
        }
    }
    
    public void pop() {
        if(st.peek().equals(mins.peek())){
            mins.pop();
        }
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return mins.peek();
    }
}