public class BSTConversion {

    // TreeNode 定義
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int v) {
            val = v;
        }
    }

    // ===== 功能 1：BST 轉換為排序的雙向鏈表 =====
    static class DoublyListNode {
        int val;
        DoublyListNode prev, next;
        DoublyListNode(int val) {
            this.val = val;
        }
    }

    static DoublyListNode head = null, prev = null;

    public static DoublyListNode bstToDoublyLinkedList(TreeNode root) {
        head = prev = null;
        inorderToList(root);
        return head;
    }

    private static void inorderToList(TreeNode root) {
        if (root == null) return;
        inorderToList(root.left);
        DoublyListNode curr = new DoublyListNode(root.val);
        if (prev != null) {
            prev.next = curr;
            curr.prev = prev;
        } else {
            head = curr;
        }
        prev = curr;
        inorderToList(root.right);
    }

    // ===== 功能 2：排序陣列轉換為平衡 BST =====
    public static TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(nums, 0, nums.length - 1);
    }

    private static TreeNode buildBST(int[] nums, int left, int right) {
        if (left > right) return null;
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildBST(nums, left, mid - 1);
        root.right = buildBST(nums, mid + 1, right);
        return root;
    }

    // ===== 功能 3：BST 每節點變為所有大於等於它的值總和 =====
    static int sum = 0;

    public static void convertBSTtoGreaterSum(TreeNode root) {
        sum = 0;
        reverseInorder(root);
    }

    private static void reverseInorder(TreeNode node) {
        if (node == null) return;
        reverseInorder(node.right);
        sum += node.val;
        node.val = sum;
        reverseInorder(node.left);
    }

    // ===== 額外：中序列印驗證 =====
    public static void printInorder(TreeNode root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }

    // ===== Doubly List 列印 =====
    public static void printDoublyList(DoublyListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    // ===== 測試主程式 =====
    public static void main(String[] args) {
        // 測試功能 1 & 3
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);

        System.out.print("原始BST中序：");
        printInorder(root);
        System.out.println();

        // 功能 1：轉成排序雙向鏈表
        DoublyListNode listHead = bstToDoublyLinkedList(root);
        System.out.print("轉換成雙向鏈表：");
        printDoublyList(listHead);

        // 功能 3：將節點值變成「大於等於該節點的總和」
        convertBSTtoGreaterSum(root);
        System.out.print("轉換後的BST（大於等於總和）：");
        printInorder(root);
        System.out.println();

        // 功能 2：排序陣列轉換為平衡 BST
        int[] sortedArr = {1, 2, 3, 4, 5, 6, 7};
        TreeNode bst = sortedArrayToBST(sortedArr);
        System.out.print("由排序陣列產生的平衡BST：");
        printInorder(bst);
        System.out.println();
    }
}
