/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        recur(root,res);
        return res;
    }
    
    private void recur(Node root, List<Integer> res) {
        res.add(root.val);
        List<Node> children = root.children;
        for(Node node : children) {
            recur(node,res);
        }
    }
}
