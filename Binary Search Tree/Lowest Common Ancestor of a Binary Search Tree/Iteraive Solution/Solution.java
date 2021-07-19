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
        while(root != null) {
            // If both p and q are smaller than the root, then LCA lies in left
            if(root.val > p.val && root.val > q.val) root = root.left;
            // If both p and q are greater than the root, then LCA lies in right
            else if(root.val < p.val && root.val < q.val) root = root.right;
            else break;
        }
        return root;
    }
}
