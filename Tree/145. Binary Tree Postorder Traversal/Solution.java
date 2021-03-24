class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        if(root != null) traverse(root, ls);
        return ls;
    }
    public static void traverse(TreeNode root, List<Integer> ls){
        
        
        if(root.left != null) traverse(root.left, ls);
        if(root.right != null) traverse(root.right, ls);
        ls.add(root.val);
    }
}
