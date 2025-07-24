


public class TreeStatistics {
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data){
            this.data=data;
        }
        }

        public static int sum(TreeNode root){
            if(root == null)return 0;
            return root.data+sum(root.left)+sum(root.right);
        }
        public static int findMax(TreeNode root){
            if(root == null)return Integer.MIN_VALUE;
            return Math.max(root.data, Math.max(findMax(root.left),findMax(root.right)));

        }
        public static int findMin(TreeNode root){
            if(root == null)return Integer.MAX_VALUE;
            return Math.min(root.data,Math.min(findMin(root.left),findMin(root.right)));
        }
        public static int countLeaves(TreeNode root){
            if(root==null)return 0;
            if(root.left==null && root.right == null)return 1;
            return countLeaves(root.left)+countLeaves(root.right);
        }
        public static int treeDepth(TreeNode root){
            if(root == null)return 0;
            return 1+Math.max(treeDepth(root.left),treeDepth(root.right));

        }
        public static void main(String[] args){
            TreeNode root=new TreeNode(10);
            root.left=new TreeNode(5);
            root.right=new TreeNode(15);
            root.left.left=new TreeNode(3);
            root.left.right=new TreeNode(7);
            root.right.right=new TreeNode(20);

            System.out.println("節點總和:"+sum(root));
            System.out.println("最大值:"+findMax(root));
            System.out.println("最小值:"+findMin(root));
            System.out.println("葉節點數量:"+countLeaves(root));
            System.out.println("樹的深度:"+treeDepth(root));
        }
        }
