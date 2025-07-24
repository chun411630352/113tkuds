import java.util.*;

public class TreeComparison {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    public static boolean isSameTree(TreeNode a, TreeNode b) {
        if (a == null && b == null) return true;
        if (a == null || b == null || a.val != b.val) return false;
        return isSameTree(a.left, b.left) && isSameTree(a.right, b.right);
    }

    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;
        if (isSameTree(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static TreeNode maxCommonSubtree(TreeNode a, TreeNode b) {
        if (a == null || b == null) return null;
        if (a.val == b.val) {
            TreeNode left = maxCommonSubtree(a.left, b.left);
            TreeNode right = maxCommonSubtree(a.right, b.right);
            TreeNode node = new TreeNode(a.val);
            node.left = left;
            node.right = right;
            return node;
        }
        TreeNode left = maxCommonSubtree(a.left, b);
        TreeNode right = maxCommonSubtree(a.right, b);
        TreeNode altLeft = maxCommonSubtree(a, b.left);
        TreeNode altRight = maxCommonSubtree(a, b.right);
        TreeNode best = getLargerTree(left, right);
        return getLargerTree(best, getLargerTree(altLeft, altRight));
    }

    private static int treeSize(TreeNode node) {
        if (node == null) return 0;
        return 1 + treeSize(node.left) + treeSize(node.right);
    }

    private static TreeNode getLargerTree(TreeNode a, TreeNode b) {
        return treeSize(a) >= treeSize(b) ? a : b;
    }

    public static void printTree(TreeNode node) {
        if (node == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(node);
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            System.out.print(curr.val + " ");
            if (curr.left != null) q.offer(curr.left);
            if (curr.right != null) q.offer(curr.right);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        a.left = new TreeNode(2);
        a.right = new TreeNode(3);
        a.left.left = new TreeNode(4);
        a.left.right = new TreeNode(5);

        TreeNode b = new TreeNode(2);
        b.left = new TreeNode(4);
        b.right = new TreeNode(5);

        System.out.println(isSameTree(a.left, b));
        System.out.println(isSubtree(a, b));

        TreeNode c = new TreeNode(1);
        c.left = new TreeNode(2);
        c.right = new TreeNode(3);
        c.left.left = new TreeNode(4);

        TreeNode d = new TreeNode(1);
        d.left = new TreeNode(2);
        d.right = new TreeNode(3);
        d.left.left = new TreeNode(7);

        TreeNode common = maxCommonSubtree(c, d);
        printTree(common);
    }
}
