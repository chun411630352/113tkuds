public class BSTBalance {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    public static boolean isBalanced(TreeNode root) {
        return checkBalance(root) != -1;
    }

    private static int checkBalance(TreeNode node) {
        if (node == null) return 0;
        int left = checkBalance(node.left);
        if (left == -1) return -1;
        int right = checkBalance(node.right);
        if (right == -1) return -1;
        if (Math.abs(left - right) > 1) return -1;
        return 1 + Math.max(left, right);
    }

    public static int getBalanceFactor(TreeNode node) {
        if (node == null) return 0;
        return height(node.left) - height(node.right);
    }

    private static int height(TreeNode node) {
        if (node == null) return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    static class ImbalanceResult {
        TreeNode node;
        int diff;
        ImbalanceResult(TreeNode node, int diff) {
            this.node = node;
            this.diff = diff;
        }
    }

    public static TreeNode findMostUnbalanced(TreeNode root) {
        return dfsImbalance(root).node;
    }

    private static ImbalanceResult dfsImbalance(TreeNode node) {
        if (node == null) return new ImbalanceResult(null, 0);
        int leftH = height(node.left);
        int rightH = height(node.right);
        int diff = Math.abs(leftH - rightH);

        ImbalanceResult leftRes = dfsImbalance(node.left);
        ImbalanceResult rightRes = dfsImbalance(node.right);

        ImbalanceResult maxChild = leftRes.diff >= rightRes.diff ? leftRes : rightRes;
        return diff > maxChild.diff ? new ImbalanceResult(node, diff) : maxChild;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(2);
        root.left.left.left = new TreeNode(1);
        root.right = new TreeNode(15);

        System.out.println("是否為平衡樹: " + isBalanced(root));
        System.out.println("根節點平衡因子: " + getBalanceFactor(root));
        TreeNode worst = findMostUnbalanced(root);
        System.out.println("最不平衡的節點: " + (worst != null ? worst.val : "無"));
    }
}
