class Pair {
    Node node;
    int hd;
    public Pair(Node node, int hd) {
        this.hd = hd;
        this.node = node;
    }
}
class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(root, 0)); // 0 is the vertical level for root
        
        while(!q.isEmpty()) {
            Pair it = q.remove();
            int hd = it.hd;
            Node temp = it.node;
            
            if(map.get(hd) == null) map.put(hd, temp.data);
            if(temp.left != null) q.add(new Pair(temp.left, hd-1));
            if(temp.right != null) q.add(new Pair(temp.right, hd+1));
        }
        // Traverse through the map and build the solution list
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
    }
}
