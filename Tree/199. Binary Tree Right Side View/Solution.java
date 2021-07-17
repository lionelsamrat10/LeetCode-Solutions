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
    public List<Integer> rightSideView(TreeNode node) {
        ArrayList<Integer> solution = new ArrayList<>();
        
        if(node == null) return solution;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        
        while(!queue.isEmpty()){
            int n = queue.size();
            for(int i=1; i<=n; i++){
                TreeNode temp = queue.poll();
                if(i == n) solution.add(temp.val);
                if(temp.left != null) queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right);
            }
        }
        
        return solution;
    }
}
