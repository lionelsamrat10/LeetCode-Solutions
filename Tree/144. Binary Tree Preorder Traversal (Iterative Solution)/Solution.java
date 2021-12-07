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
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> preorder = new ArrayList<>();
        if(root == null) return preorder; // return the empty list if the root is null
        // Push the root onto the stack
        stack.push(root);
        // Continue until the Stack is empty
        while(!stack.isEmpty()) {
            // Push the root to the Stack
            root = stack.pop();
            // Add the root data onto the solution list
            preorder.add(root.val);
            // If the right pointer or right node is not null then add it onto the stack
            if(root.right != null) stack.push(root.right);
            // If the left pointer or left node is not null then add it onto the stack
            if(root.left != null) stack.push(root.left);
        }
        return preorder;
    }
}
