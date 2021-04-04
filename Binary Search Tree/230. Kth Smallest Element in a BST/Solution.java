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
    //Create an arraylist to store the results of the inorder traversal
    List<Integer> inorderTraversalList = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        inorder(root);
        return inorderTraversalList.get(k-1);
    }
    //create the function to traverse the tree in inorder manner
    //So that we can have the sorted list of items
    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        inorderTraversalList.add(root.val);
        inorder(root.right);
    }
}
