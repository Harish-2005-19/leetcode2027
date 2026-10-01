class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];
        int last = -n;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c)
                last = i;
            ans[i] = i - last;
        }
        last = 2 * n;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c)
                last = i;
            ans[i] = Math.min(ans[i], last - i);
        }
        return ans;
    }
}