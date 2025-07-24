public class TreeMirror {

    static class TreeNode {
        int data;
        TreeNode left, right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    public static TreeNode mirror(TreeNode root) {
        if (root == null) return null;
        TreeNode temp = root.left;
        root.left = mirror(root.right);
        root.right = mirror(temp);
        return root;
    }

    public static boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        return t1.data == t2.data &&
               isMirror(t1.left, t2.right) &&
               isMirror(t1.right, t2.left);
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        a.left = new TreeNode(2);
        a.right = new TreeNode(2);
        a.left.left = new TreeNode(3);
        a.left.right = new TreeNode(4);
        a.right.left = new TreeNode(4);
        a.right.right = new TreeNode(3);

        System.out.println(isSymmetric(a));

        TreeNode b1 = new TreeNode(5);
        b1.left = new TreeNode(6);
        b1.right = new TreeNode(7);

        TreeNode b2 = new TreeNode(5);
        b2.left = new TreeNode(7);
        b2.right = new TreeNode(6);

        System.out.println(isMirror(b1, b2));

        TreeNode mirrored = mirror(b1);
        System.out.println(isMirror(mirrored, b2));
    }
}
