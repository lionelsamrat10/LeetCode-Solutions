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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList();
        pathSumHelper(root,targetSum,ans,new ArrayList<Integer>());
        return ans;
    }
    private void pathSumHelper(TreeNode node , int sum , List<List<Integer>> ans , List<Integer> path){
        if(node==null) return;
        path.add(node.val);
        if(node.left==null&&node.right==null&&sum-node.val==0){
            List<Integer> list = new ArrayList(path);
            ans.add(list);
        }
        pathSumHelper(node.left,sum-node.val,ans,path);
        pathSumHelper(node.right,sum-node.val,ans,path);
        path.remove(path.size()-1);
    }
}
