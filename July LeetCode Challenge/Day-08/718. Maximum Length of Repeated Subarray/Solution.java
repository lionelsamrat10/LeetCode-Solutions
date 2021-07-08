class Solution {
    public int findLength(int[] A, int[] B) {
        int ans = 0;
        int[][] dp = new int[A.length + 1][B.length + 1];
        for (int i = A.length - 1; i >= 0; --i) {
            for (int j = B.length - 1; j >= 0; --j) {
                if (A[i] == B[j]) {
                    dp[i][j] = dp[i+1][j+1] + 1;
                    if (ans < dp[i][j]) ans = dp[i][j];
                }
            }
        }
        return ans;
    }
}
