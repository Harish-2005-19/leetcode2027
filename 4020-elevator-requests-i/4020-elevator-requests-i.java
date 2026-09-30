class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int t = 0;
        int current = 0;
        for (int f : requests) {
            t += Math.abs(f - current);
            current = f;
        }
        return t;
    }
}