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
    private void checkparent(TreeNode root, int x ,int[] arr){
        if(root == null) return;
        if(root.left != null && root.left.val == x){
            arr[0] = root.val;
        }
        else if(root.right != null && root.right.val == x){
            arr[0] = root.val;
        } 
        checkparent(root.left,x,arr);
        checkparent(root.right,x,arr);
    }
    private int check(TreeNode root, int x){
        if(root==null) return -1;
        int depth = -1;
        if(root.val == x || ((depth = check(root.left,x))>=0) || ((depth = check(root.right,x))>=0)){
            return depth+1;
        }
        return depth;
        
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        int[] parent1 = new int[1];
        int[] parent2 = new int[1];
        checkparent(root,x,parent1);
        checkparent(root,y,parent2);
        if(parent1[0]!=parent2[0]){
            return check(root,x) == check(root,y);
        }
        return false;
    }
}
