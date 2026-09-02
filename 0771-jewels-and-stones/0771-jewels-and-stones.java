class Solution {
    public int numJewelsInStones(String j, String s) {
        int c=0;
        for(int i=0;i<j.length();i++){
            for(int k=0;k<s.length();k++){
                char a = j.charAt(i);
                char b = s.charAt(k);
                if(a==b)
                    c++;
            }
        }
        return c;
    }
}