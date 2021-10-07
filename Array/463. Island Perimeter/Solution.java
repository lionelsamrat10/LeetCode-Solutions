class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    perimeter += tryIsland(grid, i, j);
                }
            }
        }
        return perimeter;
    }

    public static int tryIsland(int[][] grid, int i, int j) {
        int landPerimeter = 0;
        try {
            if (grid[i][j - 1] == 0)
                landPerimeter++;
        } catch (IndexOutOfBoundsException ioobe) {
            landPerimeter++;
        }

        try {
            if (grid[i - 1][j] == 0)
                landPerimeter++;
        } catch (IndexOutOfBoundsException ioobe) {
            landPerimeter++;
        }

        try {
            if (grid[i][j + 1] == 0)
                landPerimeter++;
        } catch (IndexOutOfBoundsException ioobe) {
            landPerimeter++;
        }

        try {
            if (grid[i + 1][j] == 0)
                landPerimeter++;
        } catch (IndexOutOfBoundsException ioobe) {
            landPerimeter++;
        }

        return landPerimeter;
    }
}