class Solution {
    private int m; // Store number of columns
    private int n; // Strore nmumber of rows
    public int numIslands(char[][] grid) {
        // The counter stores the number of islands
        int count = 0;
        // Number of rows
        n = grid.length;
        if(n == 0) return 0;
        // Number of columns
        m = grid[0].length;
        
        // Iterate over the matrix and check for potential "1"s
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(grid[i][j] == '1') {
                    // Start the dfs
                    // Pass the matrix, i and j
                    dfs(grid, i, j);
                    // Once the dfs is done on the matrix we will get an island so increment the counter by 1
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(char[][] grid, int i, int j) {
        // Base condition
        if(i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == '0') return;
        
        // If one character is visited and its '1' mark it as '0' so that it cannot be visited again
        grid[i][j] = '0';
        
        // All the possible paths from the current character we can explore horizontally or vertically
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
        dfs(grid, i+1, j);
    }
}
