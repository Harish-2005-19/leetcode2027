class Solution {
    public String reverseWords(String s) {
        String a[] = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String x:a){
            StringBuilder r = new StringBuilder(x).reverse();
            sb.append(r).append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}