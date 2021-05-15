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
    public void flatten(TreeNode root) {
        heperFlatten(root);
    }
    
    private TreeNode heperFlatten(TreeNode root) {
        
        // Base Case
        if (root == null) {
            return root;
        }
        
        // Store right sub tree for current node
        TreeNode rightSubTree = root.right;
        
        // Attach left sub tree to right side of current node and set left subtree to null for current node
        root.right = heperFlatten(root.left);
        root.left = null;
        
        // Interate until we reach bottom most node of right subtree
        TreeNode current = root;
        while(current.right != null) current = current.right;
        
        // attach the storeed right subtree here
        current.right = heperFlatten(rightSubTree);
        
        return root;
    }
}
