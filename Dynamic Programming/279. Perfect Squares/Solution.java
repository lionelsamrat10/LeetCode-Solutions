// Dynamic Programming - Bottom up
// Space Complexity: O(n)
// Time Complexity: O(n * k) where k is the number of integers whose square is less than n

class Solution {
    public int numSquares(int n) {
        int dp[] = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        
        dp[0] = 0;
        
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], 1 + dp[i - j * j]);
            }
        }
        
        return dp[n];
    }
}
