class Solution {
    public int maxSubArray(int[] nums) {
        // Using Kadane's Algorithm to find the Maximum Contiguous Sum Subarray
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        
        for(int i=0; i<nums.length; i++) {
            // Do this: max_ending_here += nums[i]
            max_ending_here += nums[i];
            // Now check whether max_ending_here is greater than max_so_far then set max_so_far to max_ending_here
            if(max_so_far < max_ending_here)  max_so_far = max_ending_here;
            // Now check whether the max_ending_here is less than 0 then set it to 0
            if(max_ending_here < 0) max_ending_here = 0;
        }
        return max_so_far;
    }
}
