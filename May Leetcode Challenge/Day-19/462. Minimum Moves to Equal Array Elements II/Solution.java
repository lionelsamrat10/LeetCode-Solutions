class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length / 2, count = 0;
        for(int i=0; i<nums.length; i++){
            count += Math.abs(nums[i] - nums[n]);
        }
        return count;
    }
}
//Runtime: 2 ms, faster than 98.21% of Java online submissions for Minimum Moves to Equal Array Elements II.
//Memory Usage: 39.1 MB, less than 98.44% of Java online submissions for Minimum Moves to Equal Array Elements II.
