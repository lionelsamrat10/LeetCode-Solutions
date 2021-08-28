class Solution {
    public boolean validPath(int n, int[][] edges, int start, int end) {
        boolean[] used = new boolean[n];
        // Used the first node
        used[start] = true;
        // A flag variable
        boolean newUsedFound = true;
        while(!used[end] && newUsedFound) {
            newUsedFound = false;
            for(int i = edges.length - 1; i >= 0; i--) {
                if(used[edges[i][0]]) {
                    if(!used[edges[i][1]]) newUsedFound = used[edges[i][1]] = true;
                } else if(used[edges[i][1]]) {
                    newUsedFound = used[edges[i][0]] = true;
                }
            }
        }
        return used[end];
    }
}
// T(n) = O(n^2)
