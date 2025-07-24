import java.util.*;

public class TreeDistance {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    public static int distanceBetweenNodes(TreeNode root, int val1, int val2) {
        TreeNode lca = findLCA(root, val1, val2);
        int d1 = findDistance(lca, val1, 0);
        int d2 = findDistance(lca, val2, 0);
        return d1 + d2;
    }

    private static TreeNode findLCA(TreeNode root, int val1, int val2) {
        if (root == null || root.val == val1 || root.val == val2) return root;
        TreeNode left = findLCA(root.left, val1, val2);
        TreeNode right = findLCA(root.right, val1, val2);
        if (left != null && right != null) return root;
        return left != null ? left : right;
    }

    private static int findDistance(TreeNode root, int target, int depth) {
        if (root == null) return -1;
        if (root.val == target) return depth;
        int left = findDistance(root.left, target, depth + 1);
        if (left != -1) return left;
        return findDistance(root.right, target, depth + 1);
    }

    public static int findDiameter(TreeNode root) {
        int[] diameter = new int[1];
        calcHeight(root, diameter);
        return diameter[0];
    }

    private static int calcHeight(TreeNode node, int[] diameter) {
        if (node == null) return 0;
        int left = calcHeight(node.left, diameter);
        int right = calcHeight(node.right, diameter);
        diameter[0] = Math.max(diameter[0], left + right);
        return 1 + Math.max(left, right);
    }

    public static List<Integer> nodesAtDistance(TreeNode root, int k) {
        List<Integer> result = new ArrayList<>();
        findNodesAtDistance(root, k, result);
        return result;
    }

    private static void findNodesAtDistance(TreeNode node, int k, List<Integer> result) {
        if (node == null) return;
        if (k == 0) {
            result.add(node.val);
            return;
        }
        findNodesAtDistance(node.left, k - 1, result);
        findNodesAtDistance(node.right, k - 1, result);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.right.right = new TreeNode(7);

        System.out.println("節點 4 與 7 的距離: " + distanceBetweenNodes(root, 4, 7));
        System.out.println("樹的直徑: " + findDiameter(root));
        System.out.println("距離根節點 2 的節點: " + nodesAtDistance(root, 2));
    }
}
