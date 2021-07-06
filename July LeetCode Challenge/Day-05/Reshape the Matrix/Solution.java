class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length, cols = mat[0].length;
        if(r * c != rows * cols) return mat;
        int reshapedmatrix[][] = new int[r][c];
        for(int i=0; i< r * c; i++){
            reshapedmatrix[i / c][i % c] = mat[i / cols][i % cols];
        }
        return reshapedmatrix;
    }
}
