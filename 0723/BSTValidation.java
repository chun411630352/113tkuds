import java.util.*;

public class BSTValidation {

    static class TreeNode {
        int data;
        TreeNode left, right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public static boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean validate(TreeNode node, long min, long max) {
        if (node == null) return true;
        if (node.data <= min || node.data >= max) return false;
        return validate(node.left, min, node.data) && validate(node.right, node.data, max);
    }

    public static List<TreeNode> findInvalidNodes(TreeNode root) {
        List<TreeNode> invalid = new ArrayList<>();
        check(root, Long.MIN_VALUE, Long.MAX_VALUE, invalid);
        return invalid;
    }

    private static void check(TreeNode node, long min, long max, List<TreeNode> invalid) {
        if (node == null) return;
        if (node.data <= min || node.data >= max) invalid.add(node);
        check(node.left, min, node.data, invalid);
        check(node.right, node.data, max, invalid);
    }

    public static int minRemovalsToBST(TreeNode root) {
        return countInvalid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static int countInvalid(TreeNode node, long min, long max) {
        if (node == null) return 0;
        if (node.data <= min || node.data >= max)
            return 1 + countAll(node.left) + countAll(node.right);
        return countInvalid(node.left, min, node.data) + countInvalid(node.right, node.data, max);
    }

    private static int countAll(TreeNode node) {
        if (node == null) return 0;
        return 1 + countAll(node.left) + countAll(node.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(12);
        root.right.right = new TreeNode(15);

        System.out.println(isValidBST(root));

        List<TreeNode> invalidNodes = findInvalidNodes(root);
        for (TreeNode n : invalidNodes) System.out.println(n.data);

        System.out.println(minRemovalsToBST(root));
    }
}
