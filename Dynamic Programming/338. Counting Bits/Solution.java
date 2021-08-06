class Solution {
    public int[] countBits(int n) {
       int[] dp = new int[n + 1];
       for(int i=0; i<=n; i++) {
           dp[i] = binary(i);
       }
       return dp;
    }
    // Converts a decimal number to its corresponding binary form
    public int binary(int n) {
        int count = 0; // Stores the number of 1 in the binary representation
        int m = n;
        int bin = 0;
        while(m != 0) {
            bin = bin * 10 + (m % 2);
            if(m % 2 == 1) count++;
            m /= 2;
        }
        return count;
    }
}
