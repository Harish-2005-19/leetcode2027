class Solution {
    public String shortestPalindrome(String s) {

        String reversed = new StringBuilder(s).reverse().toString();

        for (int i = 0; i < s.length(); i++) {

            if (s.substring(0, s.length() - i).equals(reversed.substring(i, reversed.length()))) {

                return new StringBuilder(reversed.substring(0,i)).append(s).toString();

            }

        }
        return "";
    }
}