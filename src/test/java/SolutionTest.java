import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void maxPathSumTest1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        int expected = 6;
        int actual = new Solution().maxPathSum(root);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void maxPathSumTest2() {
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        int expected = 42;
        int actual = new Solution().maxPathSum(root);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void maxPathSumTest3() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(1);

        int expected = 48;
        int actual = new Solution().maxPathSum(root);

        Assert.assertEquals(expected, actual);
    }


}
