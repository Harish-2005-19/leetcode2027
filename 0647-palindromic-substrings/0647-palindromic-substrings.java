class Solution {
    public int solve(String s, int i, int j){
        if(i<0 || j==s.length()) return 0;
        if(s.charAt(i) == s.charAt(j)) return solve(s, i-1, j+1) + 1;
        else return 0;
    }
    public int countSubstrings(String s) {
        int max = 0;
        for(int i=0; i<s.length(); i++){
            max += solve(s,i,i) + solve(s,i,i+1);
        }
        return max;
    }
}