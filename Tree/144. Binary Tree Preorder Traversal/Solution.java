class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        if(root != null) traverse(root, ls);
        return ls;
    }
    public static void traverse(TreeNode root, List<Integer> ls){
        ls.add(root.val);
        if(root.left != null) traverse(root.left, ls);
        if(root.right != null) traverse(root.right, ls);
    }
}
