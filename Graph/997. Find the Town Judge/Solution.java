class Solution {
    public int findJudge(int n, int[][] trust) {
        // Base Condition
        if(n == 1) return 1;
        
        int indegree[] = new int[n + 1];
        int outdegree[] = new int[n + 1];
        
        // Calculate the number of in and outward edges for each node
        for(int[] itr: trust) {
            indegree[itr[1]]++;
            outdegree[itr[0]]++;
        }
        
        // A town judge has indegree = n-1 ( as all knows him ) and outdegree = 0 ( as he knows none )
        for(int i=0; i<=n; i++) {
            if(indegree[i] == n-1 && outdegree[i] == 0) return i;
        }
        return -1;
    }
}
