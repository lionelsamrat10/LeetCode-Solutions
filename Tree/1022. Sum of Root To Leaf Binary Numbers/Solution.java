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
    int res = 0;
    public int sumRootToLeaf(TreeNode root) {
        preOrder(root, 0);
        return res;
    }
    public void preOrder(TreeNode root, int currentNumber) {
        if(root != null) {
            // Form the binary to decimal conversion over here
            currentNumber = currentNumber * 2  + root.val;
            // If it is a leaf node, then update the sum
            if(root.left == null && root.right == null) res += currentNumber;
            preOrder(root.left, currentNumber);
            preOrder(root.right, currentNumber);
        }
    }
}
