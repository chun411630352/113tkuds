import java.util.ArrayList;

public class BSTRangeQuery {

    static class TreeNode {
        int data;
        TreeNode left, right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public static TreeNode insert(TreeNode root, int data) {
        if (root == null) return new TreeNode(data);
        if (data < root.data) root.left = insert(root.left, data);
        else root.right = insert(root.right, data);
        return root;
    }

    public static ArrayList<Integer> rangeQuery(TreeNode root, int min, int max) {
        ArrayList<Integer> result = new ArrayList<>();
        inOrderRange(root, min, max, result);
        return result;
    }

    private static void inOrderRange(TreeNode node, int min, int max, ArrayList<Integer> result) {
        if (node == null) return;
        if (node.data > min) inOrderRange(node.left, min, max, result);
        if (node.data >= min && node.data <= max) result.add(node.data);
        if (node.data < max) inOrderRange(node.right, min, max, result);
    }

    public static void main(String[] args) {
        int[] values = {20, 10, 30, 5, 15, 25, 35};
        TreeNode root = null;
        for (int val : values) root = insert(root, val);
        int min = 12, max = 27;
        ArrayList<Integer> result = rangeQuery(root, min, max);
        System.out.println(result);
    }
}
