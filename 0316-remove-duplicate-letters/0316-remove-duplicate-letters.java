class Solution {
    public String removeDuplicateLetters(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        String str = "";
        for (char c : s.toCharArray()) {
            count[c - 'a']--;
            if (str.indexOf(c) != -1) {
                continue;
            }
            while(!str.isEmpty()&&str.charAt(str.length()-1)>c&&count[str.charAt(str.length()-1)-'a']>0) 
            {
                str = str.substring(0, str.length() - 1);
            }
            str += c;
        }
        return str;
    }
}