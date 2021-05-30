class Solution {
    public int totalNQueens(int n) {
        return solveNQueens(n, 0, new ArrayList<>(n));
        
    }
    private int solveNQueens(int n, int row, List<Integer> colPlacement) {
        if (row == n) {
            return 1;
        }
        int num = 0;
        for (int col = 0; col < n; col++) {
            colPlacement.add(col);
            if (isValid(colPlacement)) {
                num += solveNQueens(n, row + 1, colPlacement);
            }
            colPlacement.remove(colPlacement.size() - 1);
        }
        return num;
    }
    private boolean isValid(List<Integer> colPlacement) {
        int rowId = colPlacement.size() - 1;
        int colId = colPlacement.get(rowId);
        
        for (int i = 0; i < rowId; i++) {
            int diff = Math.abs(colPlacement.get(i) - colId);
            if (diff == 0 || diff == rowId - i) {
                return false;
            }
        }
        return true;
    }
}
