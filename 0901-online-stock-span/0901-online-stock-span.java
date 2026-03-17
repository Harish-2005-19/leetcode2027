class StockSpanner {
    Stack<int[]> st = new Stack<>();
    public int next(int price) {
        int d=1;
        while(!st.isEmpty() && st.peek()[0]<=price){
            d+=st.pop()[1];
        }
        st.push(new int[]{price,d});
        return d;
    }
}