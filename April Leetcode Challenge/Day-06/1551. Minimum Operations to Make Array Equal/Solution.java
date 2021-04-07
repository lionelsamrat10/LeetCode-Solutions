class Solution {
    public int minOperations(int n) {
        int minOperation = 0;
        
        for(int i=0; i<n/2; i++){
            minOperation += (n - (2 * i + 1));
        }
        return minOperation;
    }
}
