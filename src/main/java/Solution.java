public class Solution {
    public int maxPathSum(TreeNode root) {
        if (root.left == null && root.right == null) return root.val;
        int[] maxSum = new int[1];
        maxSum[0] = Integer.MIN_VALUE;
        dfs(root, maxSum);
        return maxSum[0];
    }

    private int dfs(TreeNode root, int[] maxSum) {
        if (root == null) return 0;

        int leftSum = Math.max(0, dfs(root.left, maxSum));
        int rightSum = Math.max(0, dfs(root.right, maxSum));

        maxSum[0] = Math.max(maxSum[0], leftSum + rightSum + root.val);


        return Math.max(leftSum, rightSum) + root.val;
    }
}
