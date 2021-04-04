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
//Author: Samrat Mitra
//Not so efficient but easy to understand solution, will optimise it further and add here soon.
class Solution {
    List<Integer> inorderTraversal = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        inorder_traversal(root);
        
        for(int i=1; i<inorderTraversal.size(); i++){
            if(inorderTraversal.get(i-1) < inorderTraversal.get(i)){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
    public void inorder_traversal(TreeNode root){
        if(root == null) return;
        inorder_traversal(root.left);
        inorderTraversal.add(root.val);
        inorder_traversal(root.right);
    }
}
