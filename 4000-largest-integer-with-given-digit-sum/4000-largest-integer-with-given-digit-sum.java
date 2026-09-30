class Solution {
    public int largestInteger(int n, int s) {
        if (s > 9 * n) return -1;
        if (s == 0) return 0;
        int ans = 0;
        while (n-- > 0) {
            if (s >= 9) {
                ans += 9;
                s -= 9;
            } else {
                ans += s;
                s = 0;
            }
            ans *= 10;
        }
        return ans / 10;
    }
}