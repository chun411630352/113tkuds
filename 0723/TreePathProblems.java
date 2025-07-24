import java.util.*;

public class TreePathProblems {

    static class TreeNode {
        int data;
        TreeNode left, right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public static List<List<Integer>> allRootToLeafPaths(TreeNode root) {
        List<List<Integer>> paths = new ArrayList<>();
        findPaths(root, new ArrayList<>(), paths);
        return paths;
    }

    private static void findPaths(TreeNode node, List<Integer> current, List<List<Integer>> paths) {
        if (node == null) return;
        current.add(node.data);
        if (node.left == null && node.right == null) {
            paths.add(new ArrayList<>(current));
        } else {
            findPaths(node.left, current, paths);
            findPaths(node.right, current, paths);
        }
        current.remove(current.size() - 1);
    }

    public static boolean hasPathSum(TreeNode root, int target) {
        if (root == null) return false;
        if (root.left == null && root.right == null) return target == root.data;
        return hasPathSum(root.left, target - root.data) || hasPathSum(root.right, target - root.data);
    }

    public static List<Integer> maxSumPath(TreeNode root) {
        List<Integer> maxPath = new ArrayList<>();
        findMaxSumPath(root, new ArrayList<>(), 0, new int[]{Integer.MIN_VALUE}, maxPath);
        return maxPath;
    }

    private static void findMaxSumPath(TreeNode node, List<Integer> current, int sum, int[] maxSum, List<Integer> maxPath) {
        if (node == null) return;
        current.add(node.data);
        sum += node.data;
        if (node.left == null && node.right == null) {
            if (sum > maxSum[0]) {
                maxSum[0] = sum;
                maxPath.clear();
                maxPath.addAll(new ArrayList<>(current));
            }
        } else {
            findMaxSumPath(node.left, current, sum, maxSum, maxPath);
            findMaxSumPath(node.right, current, sum, maxSum, maxPath);
        }
        current.remove(current.size() - 1);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        List<List<Integer>> paths = allRootToLeafPaths(root);
        for (List<Integer> path : paths) System.out.println(path);

        System.out.println(hasPathSum(root, 22));
        System.out.println(maxSumPath(root));
    }
}
