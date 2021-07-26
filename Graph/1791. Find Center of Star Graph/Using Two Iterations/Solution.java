class Solution {
    public int findCenter(int[][] edges) {
        Set<Integer> set = new HashSet<>();
        
        for(int i=0; i<edges.length; i++) {
            for(int j=0; j<edges[i].length; j++) {
                if(!set.contains(edges[i][j])) {
                    set.add(edges[i][j]);
                } else {
                    return edges[i][j];
                }
            }
        }
        return 0;
    }
}
// This solution is taking O(n^2) time and O(n) Space beacause we are using a set here to store the node values those are appearing more than once
