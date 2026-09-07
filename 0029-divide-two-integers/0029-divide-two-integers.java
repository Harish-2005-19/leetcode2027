class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        int ans = 0;
        while (a >= b) {
            long x = b;
            int count = 1;
            while (a >= x + x) {
                x += x;
                count += count;
            }
            a -= x;
            ans += count;
        }
        if ((dividend < 0) != (divisor < 0))
            return -ans;
        return ans;
    }
}