class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0], count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }
        for(int i=0; i<nums.length; i++){
            count += nums[i] - min;
        }
        return count;
    }
}

// Runtime: 1 ms, faster than 100.00% of Java online submissions for Minimum Moves to Equal Array Elements.
// Memory Usage: 39.4 MB, less than 56.01% of Java online submissions for Minimum Moves to Equal Array Elements.
