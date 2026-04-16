class MinStack {

    Stack<int[]> st;

    public MinStack() {
        st = new Stack();
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            int[] temp = new int[2];
            temp[0] = val;
            temp[1] = val;
            st.push(temp);
        }
        else{
            int[] temp = new int[2];
            temp[0] = val;
            temp[1] = Math.min(val, st.peek()[1]);
            st.push(temp);
        }
        
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek()[0];
    }
    
    public int getMin() {
        return st.peek()[1];

    }
}
