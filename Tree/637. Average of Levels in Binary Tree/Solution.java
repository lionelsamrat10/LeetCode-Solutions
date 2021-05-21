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
//Using Level Order Traversal
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> averageOfLevels = new ArrayList<>();
        if(root == null) return averageOfLevels;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            int count = size;
            double sumOfNodeValuesAtLevel = 0;
            while(size-- > 0){
                TreeNode node = queue.poll();
                sumOfNodeValuesAtLevel += node.val;
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            averageOfLevels.add(sumOfNodeValuesAtLevel / count);
        }
        return averageOfLevels;
    }
}

// Runtime: 2 ms, faster than 79.08% of Java online submissions for Average of Levels in Binary Tree.
// Memory Usage: 40.9 MB, less than 53.67% of Java online submissions for Average of Levels in Binary Tree.
