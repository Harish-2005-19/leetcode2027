class Solution {

    int m, n;
    char[][] grid;
    byte[][][] dp;

    public boolean hasValidPath(char[][] grid) {

        this.grid = grid;
        m = grid.length;
        n = grid[0].length;

        int len = m + n - 1;

        if (grid[0][0] != '(' || grid[m - 1][n - 1] != ')')
            return false;

        if ((len & 1) == 1)
            return false;

        dp = new byte[m][n][len + 1];

        return dfs(0, 0, 0);
    }

    private boolean dfs(int r, int c, int balance) {

        balance += grid[r][c] == '(' ? 1 : -1;

        if (balance < 0)
            return false;

        int remaining = (m - 1 - r) + (n - 1 - c);

        if (balance > remaining)
            return false;

        if (r == m - 1 && c == n - 1)
            return balance == 0;

        if (dp[r][c][balance] != 0)
            return dp[r][c][balance] == 2;

        boolean ok = false;

        if (r + 1 < m)
            ok = dfs(r + 1, c, balance);

        if (!ok && c + 1 < n)
            ok = dfs(r, c + 1, balance);

        dp[r][c][balance] = (byte)(ok ? 2 : 1);

        return ok;
    }
}