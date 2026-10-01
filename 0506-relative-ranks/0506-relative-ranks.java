class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] ans = new String[n];
        int[] sorted = score.clone();
        Arrays.sort(sorted);
        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = n - 1; j >= 0; j--) {
                if (score[i] == sorted[j])
                    break;
                rank++;
            }
            if (rank == 1)
                ans[i] = "Gold Medal";
            else if (rank == 2)
                ans[i] = "Silver Medal";
            else if (rank == 3)
                ans[i] = "Bronze Medal";
            else
                ans[i] = String.valueOf(rank);
        }
        return ans;
    }
}