class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        for (String operation : operations) {
            if (operation.equals("+")) {
                int a = s.pop();
                int b = s.peek();
                s.push(a);
                s.push(a + b);
            } else if (operation.equals("C")) {
                s.pop();
            } else if (operation.equals("D")){
                s.push(2*s.peek());
            }else{
                s.push(Integer.parseInt(operation));
            }

        }
        int sum = 0;
        while (!s.isEmpty()) { 
            sum+=s.pop();
        }
        return sum;
    }
}