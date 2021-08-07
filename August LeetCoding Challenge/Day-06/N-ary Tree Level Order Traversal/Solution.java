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
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> traversal = new ArrayList<>();
        traverseLevelOrder(root, traversal, 0);
        return traversal;
    }
    public void traverseLevelOrder(Node root, List<List<Integer>> traversal, int level) {
        if(root == null) return;
        if(traversal.size() == level) traversal.add(new ArrayList<>());
        traversal.get(level).add(root.val);
        for(Node child: root.children) {
            traverseLevelOrder(child, traversal, level + 1);
        }
    }
}
