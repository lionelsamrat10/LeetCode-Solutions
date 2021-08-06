class Solution {
    public int getMaximumGenerated(int n) {
        if(n < 2) return n;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        int max = Integer.MIN_VALUE;
        for(int i = 1; i <= n/2; i++) {
            if(2 * i <= n) {
                dp[2 * i] = dp[i];
                max = Math.max(max, dp[2 * i]);
            }
            if(2 * i + 1 <= n) {
                dp[2 * i + 1] = dp[i] + dp[i + 1];
                max = Math.max(max, dp[2 * i + 1]);
            } 
        }
        return max;
    }
}
