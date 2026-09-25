class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for (int x : nums) {
            freq[x]++;
            max = Math.max(max, freq[x]);
        }
        for (int x : freq) {
            if (x == max) {
                ans += x;
            }
        }
        return ans;
    }
}