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
    int first_min;
    long final_ans = Long.MAX_VALUE;
    
    public int findSecondMinimumValue(TreeNode root) {
        first_min = root.val;
        preOrder(root);
        return final_ans < Long.MAX_VALUE ? (int) final_ans : -1;
    }
    
    public void preOrder(TreeNode root) {
        if (root != null) {
            if (first_min < root.val && root.val < final_ans) {
                final_ans = root.val;
            } else if (first_min == root.val) {
                preOrder(root.left);
                preOrder(root.right);
            }
        }
    }
}

// T(n) = O(n)
// S(n) = O(n)
