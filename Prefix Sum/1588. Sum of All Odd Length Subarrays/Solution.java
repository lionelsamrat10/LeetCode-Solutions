class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        // Calculate the Prefix Sum
        int[] sum = new int[arr.length];
        sum[0] = arr[0];
        for(int i=1; i<arr.length; i++) {
            sum[i] = sum[i-1] + arr[i];
        }
        // Subarray sum
        int res = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j + i < arr.length; j += 2) {
                res += getSum(sum, i, j + i);
            }
        }
        return res;
    }
    public int getSum(int[] sum, int start, int end) {
        return start == 0 ? sum[end] : sum[end] - sum[start - 1];
    }
}
