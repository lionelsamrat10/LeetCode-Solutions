//Author: Samrat Mitra
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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        else{
            //Get the height of the left subtree
            int leftDepth = maxDepth(root.left);
            //Get the height of the right subtree
            int rightDepth = maxDepth(root.right);
            
            if(leftDepth > rightDepth) return (leftDepth + 1);
            else return (rightDepth + 1);
        }
    }
}
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of Binary Tree.
//Memory Usage: 38.6 MB, less than 96.06% of Java online submissions for Maximum Depth of Binary Tree.
