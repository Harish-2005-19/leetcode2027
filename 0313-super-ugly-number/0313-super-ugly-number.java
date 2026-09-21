class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] res = new int[n];
        res[0] = 1;
        int[] cur = new int[primes.length];
        for (int i = 1; i < n; i++) {
            long min = Long.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                long value = (long) primes[j] * res[cur[j]];
                min = Math.min(min, value);
            }
            res[i] = (int) min;
            for (int j = 0; j < primes.length; j++) {
                long value = (long) primes[j] * res[cur[j]];
                if (value == res[i])
                    cur[j]++;
            }
        }
        return res[n - 1];
    }
}