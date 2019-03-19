package problem_108;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class SortedArrayToBinaryTree {
    public static void main(String[] args) {
        SortedArrayToBinaryTree s = new SortedArrayToBinaryTree();
        TreeNode tnode = s.sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});



    }

    public TreeNode sortedArrayToBST(int[] nums) {
        BinaryTree binaryTree = new BinaryTree();


        int len = nums.length / 2;

        int lt = nums.length;
        if (lt > 0) {
            boolean b = (lt % 2 == 0) ? true : false;
            int i = len, k = 0;
            binaryTree.insert(nums[i], binaryTree.root);
            while (i > 0) {
                binaryTree.insert(nums[--i], binaryTree.root);

                if (!b || i != 0) {
                    binaryTree.insert(nums[--lt], binaryTree.root);
                }


            }

            return binaryTree.root;
        }
        return new BinaryTree().root;
    }


}

class BinaryTree {
    TreeNode root;

    BinaryTree() {
        this.root = null;
    }

    public TreeNode insert(int data, TreeNode treeNode) {
        if (this.root == null) {
            root = new TreeNode(data);
            return root;
        }


        if (treeNode == null) {
            treeNode = new TreeNode(data);
            return treeNode;
        } else if (data < treeNode.val) {
            treeNode.left = insert(data, treeNode.left);
        } else {
            treeNode.right = insert(data, treeNode.right);
        }
        return treeNode;
    }



}
