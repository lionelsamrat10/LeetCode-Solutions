/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case
        if(root == null || root == p || root == q) return root;
        
        // Left traversal
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        // Right traversal
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        
        // Get the solution
        if(left == null) return right;
        else if(right == null) return left;
        else return root;
    }
}
