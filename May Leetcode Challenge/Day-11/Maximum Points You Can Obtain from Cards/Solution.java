class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int total_sum = 0;
        //Find total_sum upto first k elements
        for(int i = 0; i < k; i++)
            total_sum += cardPoints[i];
        int best = total_sum;
        for(int i = k-1, j = cardPoints.length-1; i >= 0; i--, j--){
            total_sum += cardPoints[j] - cardPoints[i];
            best = Math.max(best, total_sum);
        }
        return best;
    }
}
