/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int desiredSum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        return dfs(root, false);
    }
    public int dfs(TreeNode root, boolean isLeftNode) {
        if (root == null) return 0;
        if (isLeftNode && isLeafNode(root)) desiredSum += root.val;
        // Traverse left subtree
        // We'll encounter left leaf here, thus make the isLeftNode true
        dfs(root.left, true);
        // Traverse Right subtree
        // We'll encounter right leaf here, thus make the isLeftNode false
        dfs(root.right, false);
        return desiredSum;
    }
    public boolean isLeafNode(TreeNode root) {
        return root.left == null && root.right == null;
    }
}
