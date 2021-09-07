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
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> ans = constr(1,n);
        return ans;
    }
    public List<TreeNode> constr(int start,int end){
        List<TreeNode> list = new ArrayList();
        if(start>end){
            list.add(null);
            return list;
        }
        for(int i=start;i<=end;i++){
            List<TreeNode> leftchld = constr(start, i-1);
            List<TreeNode> rightchld = constr(i+1, end);
            for(int j =0;j<leftchld.size();j++){
                TreeNode left = leftchld.get(j);
                for(int k =0; k<rightchld.size();k++){
                    TreeNode right = rightchld.get(k);
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    list.add(root);
                }
            }
        }
        return list;
    }
}
