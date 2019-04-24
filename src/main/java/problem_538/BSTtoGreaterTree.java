package problem_538;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class BSTtoGreaterTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(13);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(6);
        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(14);
        BSTtoGreaterTree bsTtoGreaterTree = new BSTtoGreaterTree();
        bsTtoGreaterTree.convertBST(root);

    }

    public TreeNode convertBST(TreeNode root) {
        helper(root, 0);
        return root;
    }

    public int helper(TreeNode ro, int sum) {
        if (ro == null) {
            return sum;
        }
        ro.val = ro.val + helper(ro.right, sum);
        sum = ro.val;
//        return ro.val;
//            sum = ro.val;
        if (ro.left != null) {
            sum = ro.left.val + helper(ro.left, sum);
            ro.left.val = sum;
        }
        return sum;
    }


}
