// Using Sliding Window Technique
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        int start = 0, n = nums.length, sum = 0, answer = -1;
        
        for(int end = 0; end < n; end++) {
            // If the window has duplicate elements then shrink the window from the left
            if(set.contains(nums[end])) {
                while(set.contains(nums[end])) {
                    sum -= nums[start];
                    set.remove(nums[start]);
                    start++;
                }
            }
            // Expand the window from the right
            set.add(nums[end]);
            sum += nums[end];
            // Calculate the max window sum
            answer = Math.max(answer, sum);
        }
        
        return answer;
    }
}
