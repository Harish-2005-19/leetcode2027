class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<students.length;i++){
            q.add(students[i]);
        }
        for(int j=sandwiches.length-1;j>=0;j--){
            st.push(sandwiches[j]);
        }
        int rej=0;
        while(!st.isEmpty() && !q.isEmpty()){
            if(st.peek() == q.peek()){
                st.pop();
                q.remove();
                rej=0;
            }
            else{
                q.add(q.remove());
                rej++;
                if(rej==q.size()){
                    return q.size();
                }
            }
        }
        return q.size();
    }
}