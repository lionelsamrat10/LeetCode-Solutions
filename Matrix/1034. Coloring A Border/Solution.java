class Solution {
	int[][] dirs = {{1,0},{0,1},{-1,0},{0,-1}};
	int[][] gridClone = null;

	public int[][] colorBorder(int[][] grid, int r0, int c0, int color) {
		boolean[][] visited = new boolean[grid.length][grid[0].length];
		gridClone = Arrays.stream(grid).map(r -> r.clone()).toArray(int[][]::new);
		helper(grid,r0,c0,grid[r0][c0],color,visited);
		return grid;
	}

	public void helper(int[][] grid, int r, int c, int oldColor,int newColor,boolean[][] visited ){
		if(r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c]!=oldColor || visited[r][c])
			return;

		visited[r][c] = true;
		for(int[] dir:dirs){
			if(r+dir[0] < 0 || r+dir[0] >= grid.length || c+dir[1] < 0 
			   || c+dir[1] >= grid[0].length || gridClone[r+dir[0]][c+dir[1]]!=oldColor)
				grid[r][c] = newColor;

			helper(grid,r+dir[0],c+dir[1],oldColor,newColor,visited);
		}
	}
}
