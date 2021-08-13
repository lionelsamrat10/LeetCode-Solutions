// Problem Link : https://leetcode.com/problems/minimum-size-subarray-sum/
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int left = 0, right = 0, sum = 0, ans = Integer.MAX_VALUE;
        for(right = 0; right < nums.length; right++) {
            sum += nums[right];
            while(sum >= target) {
                ans = Math.min(ans, right - left + 1);
                sum -= nums[left++];
            }
        }
        return ans != Integer.MAX_VALUE ? ans : 0;
    }
}

// Time Complexity - O(n)
