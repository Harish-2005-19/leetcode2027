class Solution {
    public boolean isValid(String s) {
        Stack<Character> h = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                h.push(')');
            }
            else if(ch=='['){
                h.push(']');
            }
            else if(ch=='{'){
                h.push('}');
            }
            else if(h.isEmpty()||ch!=h.pop()){
                return false;
            }
        }
        return h.isEmpty();
    }
}