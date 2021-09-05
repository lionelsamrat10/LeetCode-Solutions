class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        // Reverse Part-01
        reverse(nums, 0, len-k-1);
        // Reverse Part-02
        reverse(nums, len-k, len-1);
        // Reverse the whole array
        reverse(nums, 0, len-1);
    }
    public void reverse(int nums[], int low, int high) {
        while(low < high) {
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }
}
