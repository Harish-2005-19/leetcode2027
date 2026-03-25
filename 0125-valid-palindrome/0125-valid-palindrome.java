class Solution {
    public boolean isPalindrome(String s) {
        String r = "";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                r+=Character.toLowerCase(c);
            }
        }
        String rev = "";
        for(int i=r.length()-1;i>=0;i--){
            rev+=r.charAt(i);
        }
        return rev.equals(r);
    }
}