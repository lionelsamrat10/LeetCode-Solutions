class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int f[] = new int[cost.length + 1];
        
        for(int i = 2; i <= cost.length; i++){
            f[i] = Math.min(cost[i - 1] + f[i - 1], cost[i - 2] + f[i - 2]);
        }
        
        return f[cost.length];
    }
}
