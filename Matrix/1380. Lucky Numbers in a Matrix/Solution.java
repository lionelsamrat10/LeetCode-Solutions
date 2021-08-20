class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> solution = new ArrayList<>();
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                int number = matrix[i][j];
                boolean minInRow = isMinInRow(matrix, i, number);
                boolean maxInCol = isMaxInCol(matrix, j, number);
                if(minInRow && maxInCol) solution.add(number);
            }
        }
        return solution;
    }
    public boolean isMinInRow(int[][] matrix, int i, int number) {
        for(int j=0; j<matrix[0].length; j++) {
            if(matrix[i][j] != number && matrix[i][j] < number) return false;
        }
        return true;
    }
    
    public boolean isMaxInCol(int[][] matrix, int j, int number) {
        for(int i=0; i<matrix.length; i++) {
            if(matrix[i][j] != number && matrix[i][j] > number) return false;
        }
        return true;
    }
}
