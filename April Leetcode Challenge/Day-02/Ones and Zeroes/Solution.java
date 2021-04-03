class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m+1][n+1];
        
        for(String itr: strs){
            int zeroes = 0, ones = 0;
            for(char ch: itr.toCharArray()){
                if(ch == '0'){
                    zeroes++;
                }else{
                    ones++;
                }
            }
            //Find number of subsets
            for(int i=m; i>=zeroes; i--){
                for(int j=n; j>=ones; j--){
                    dp[i][j] = Math.max(dp[i][j], dp[i-zeroes][j-ones] + 1);
                }
            }
        }
        //return the maximum number of subsets with given condition
        return dp[m][n];
    }
}
