public class BSTKthElement {

    static class TreeNode {
        int data;
        TreeNode left, right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    static class Counter {
        int count = 0;
        int result = -1;
    }

    public static TreeNode insert(TreeNode root, int data) {
        if (root == null) return new TreeNode(data);
        if (data < root.data) root.left = insert(root.left, data);
        else root.right = insert(root.right, data);
        return root;
    }

    public static int findKthSmallest(TreeNode root, int k) {
        Counter counter = new Counter();
        inorder(root, k, counter);
        return counter.result;
    }

    private static void inorder(TreeNode node, int k, Counter counter) {
        if (node == null || counter.count >= k) return;
        inorder(node.left, k, counter);
        counter.count++;
        if (counter.count == k) {
            counter.result = node.data;
            return;
        }
        inorder(node.right, k, counter);
    }

    public static void main(String[] args) {
        int[] values = {20, 10, 30, 5, 15, 25, 35};
        TreeNode root = null;
        for (int val : values) root = insert(root, val);
        System.out.println(findKthSmallest(root, 3));
        System.out.println(findKthSmallest(root, 5));
    }
}
