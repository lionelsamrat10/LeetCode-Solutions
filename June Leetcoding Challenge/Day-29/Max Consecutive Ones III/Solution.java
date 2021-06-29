class Solution {
    public int longestOnes(int[] nums, int k) {
        int longest = 0;
        for (int left = 0, right = 0, zeroes = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroes++;
            }
            
            while (zeroes > k) {
                if (nums[left++] == 0) {
                    zeroes--;
                }
            }
            
            longest = Math.max(longest, right - left + 1);
        }
        return longest;
    }
}
