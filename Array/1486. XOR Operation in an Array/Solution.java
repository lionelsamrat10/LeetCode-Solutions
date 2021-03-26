class Solution {
    public int xorOperation(int n, int start) {
        int sum = 0;
        int nums[] = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = start + 2 * i;
        }
        for(int itr: nums){
            sum ^= itr; 
        }
        return sum;
    }
}
//Runtime: 0 ms, faster than 100.00% of Java online submissions for XOR Operation in an Array.
//Memory Usage: 35.9 MB, less than 35.15% of Java online submissions for XOR Operation in an Array.
