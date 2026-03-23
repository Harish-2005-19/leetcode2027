class Solution {
    public int lengthOfLongestSubstring(String s) {
        int f[] = new int[256];
        int max = 0;
        int left=0;
        for(int right=0;right<s.length();right++){
            f[s.charAt(right)]++;
            while(f[s.charAt(right)]>1){
                f[s.charAt(left)]--;
                left++;
            }
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}