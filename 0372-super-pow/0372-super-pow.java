class Solution {
    private static final int MOD = 1337;

    private int pow(int a, int b) {
        int r = 1;
        a %= MOD;  
        for (int i = 0; i < b; i++) {
            r = (r * a) % MOD;
        }
        return r;
    }

    public int superPow(int a, int[] b) {
        int r = 1;
        for (int i = b.length - 1; i >= 0; i--) {
            r = (r * pow(a, b[i])) % MOD;
            a = pow(a, 10);  
        }
        return r;
    }
}