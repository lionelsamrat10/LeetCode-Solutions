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
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> nodeValues = new ArrayList<>();
        inOrder(root, nodeValues);
        // Create a new dummy head node and link up the other nodes in order to get the desired tree
        TreeNode solutionTree = new TreeNode(0), curr = solutionTree;
        for(int node: nodeValues){
            // Create a new TreeNode and add it to the right of the curr
            curr.right = new TreeNode(node);
            curr = curr.right;
        }
        return solutionTree.right;
    }
    // Create a function to perform inOrder traversal of the tree
    public void inOrder(TreeNode node, List<Integer> nodeValues){
        if(node == null) return;
        inOrder(node.left, nodeValues);
        nodeValues.add(node.val);
        inOrder(node.right, nodeValues);
    }
}
