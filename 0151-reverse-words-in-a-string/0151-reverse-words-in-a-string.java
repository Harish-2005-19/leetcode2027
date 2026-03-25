class Solution {
    public String reverseWords(String s) {
        String str[] = s.trim().split("\\s+");
        String r = "";
        for(int i=str.length-1;i>=0;i--){
            r+=str[i]+" ";
        }
        return r.trim();
    }
}