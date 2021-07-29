class Solution {
    public int[][] updateMatrix(int[][] matrix) {
        int rowLast = matrix.length - 1;
        int colLast = matrix[0].length - 1;
        
        // Use matrix[][] as a dynamic programming array.  We need two passes
        // through the dp array.  One pass scanning cells moving down and right, 
        // the other up and left.  We make processing more efficient for larger 
        // arrays by referencing the rows of the array through one-dimensional 
        // arrays row[] and prevRow[], to save the time of repeatedly using two 
        // indexes.  Also use separate processing for the 1) starting corner cell, 
        // 2) starting row, and 3) all other cells.  This saves us from doing 
        // separate checks in a single generalized loop that would need to 
        // repeatedly check to see if we are at the starting row or the starting 
        // column.
        
        // ------- Pass #1: Scan down and right.  Look up and left from each cell.
        int[] row = matrix[0];
        int[] prevRow;
        if (row[0] == 1)                        // Top left corner
            row[0] = rowLast + colLast + 2;
        for (int c = 1; c <= colLast; c++)      // Top row (except top left corner)
            if (row[c] == 1)  
                row[c] = row[c - 1] + 1;
        for (int r = 1; r <= rowLast; r++) {    // All of the other rows (not first row)
            prevRow = row;
            row = matrix[r];
            if (row[0] == 1)                    // First column in the current row
                row[0] = prevRow[0] + 1;
            for (int c = 1; c <= colLast; c++)  // Other columns in the current row
                if (row[c] == 1)
                    row[c] = Math.min(row[c - 1], prevRow[c]) + 1;
        }
        
        // ------- Pass #2: Scan left and up.  Look right and below from each cell.
        row = matrix[rowLast];
        for (int c = colLast - 1; c >= 0; c--)      // Bottom row (except bottom right corner)
            if (row[c] > 1)
                row[c] = Math.min(row[c], row[c + 1] + 1);
        for (int r = rowLast - 1; r >= 0; r--) {    // All of the other rows (not bottom row)
            prevRow = row;
            row = matrix[r];
            if (row[colLast] > 1)                   // Rightmost column in current row
                row[colLast] = Math.min(row[colLast], prevRow[colLast] + 1);
            for (int c = colLast - 1; c >= 0; c--)  // Other columns in currwnr row
                if (row[c] > 1)
                    row[c] = Math.min(row[c], Math.min(row[c + 1], prevRow[c]) + 1);
        }
        
        return matrix;
    }
}
