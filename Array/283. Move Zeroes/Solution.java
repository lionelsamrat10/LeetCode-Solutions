// T(n) = O(n)
// S(n) = O(1)
class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 1) return;
        int left = 0, curr_idx = 0;
        while(curr_idx < nums.length){
            if(nums[curr_idx] != 0){
                swap(nums, left, curr_idx);
                left++;
            }
            curr_idx++;
        }
    }
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

// Runtime: 0 ms, faster than 100.00% of Java online submissions for Move Zeroes.
// Memory Usage: 39.2 MB, less than 45.82% of Java online submissions for Move Zeroes.
