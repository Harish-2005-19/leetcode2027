class Solution {
    int ans = 0;

    class Pair {
        int sum;
        int count;

        Pair(int sum, int count) {
            this.sum = sum;
            this.count = count;
        }
    }

    public int averageOfSubtree(TreeNode root) {
        solve(root);
        return ans;
    }
    Pair solve(TreeNode root) {
        if (root == null)
            return new Pair(0, 0);

        Pair left = solve(root.left);
        Pair right = solve(root.right);

        int sum = left.sum + right.sum + root.val;
        int count = left.count + right.count + 1;

        if (sum / count == root.val)
            ans++;
        return new Pair(sum, count);
    }
}