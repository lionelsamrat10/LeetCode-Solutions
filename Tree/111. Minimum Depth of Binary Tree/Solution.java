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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        
        //If the root node is the only node 
        if(root.left == null && root.right == null) return 1;
        //If the left subtree is null, recur for thr right subtree only
        if(root.left == null) return minDepth(root.right) + 1;
        //If right subtree is null, recur for the left subtree only
        if(root.right == null) return minDepth(root.left) + 1;
        
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
//Runtime: 4 ms, faster than 73.39% of Java online submissions for Minimum Depth of Binary Tree.
//Memory Usage: 60 MB, less than 58.65% of Java online submissions for Minimum Depth of Binary Tree.
