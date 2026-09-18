class Solution {
    public int reverseBits(int n) {
        int x = 0;
        for (int i = 0; i < 32; i++) {
            int temp = n & 1;
            x = (x << 1) | temp;
            n = n >>> 1;
        }
        return x;
    }
}