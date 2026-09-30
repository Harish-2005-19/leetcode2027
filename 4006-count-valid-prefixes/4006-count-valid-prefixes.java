class Solution {
    public int countValidPrefixes(String s) {
        int ans = 0;
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '1')
                count++;
            else
                count--;

            if (Math.abs(count) <= 1)
                ans++;
        }
        return ans;
    }
}