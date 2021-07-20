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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leavesOfLeftSubTree = new ArrayList<>();
        List<Integer> leavesOfRightSubTree = new ArrayList<>();
        
        dfs(root1, leavesOfLeftSubTree);
        dfs(root2, leavesOfRightSubTree);
        
        return leavesOfLeftSubTree.equals(leavesOfRightSubTree);
    }
    public void dfs(TreeNode root, List<Integer> leafNodeValues) {
        if(root != null) {
            if(root.left == null && root.right == null) leafNodeValues.add(root.val);
            dfs(root.left, leafNodeValues);
            dfs(root.right, leafNodeValues);
        }
    }
}
