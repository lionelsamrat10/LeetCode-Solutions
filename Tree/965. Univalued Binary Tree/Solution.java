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
    ArrayList<Integer> inOrderList;
    public boolean isUnivalTree(TreeNode root) {
        inOrderList = new ArrayList<>();
        inOrder(root);
        for(int nodeVal: inOrderList){
            if(nodeVal != inOrderList.get(0)) return false;
        }
        return true;
    }
    public void inOrder(TreeNode root) {
        if(root == null) return;
        inOrder(root.left);
        inOrderList.add(root.val);
        inOrder(root.right);
    }
}
