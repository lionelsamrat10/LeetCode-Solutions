class Solution {
    public int findPeakElement(int[] nums) {
        return bin_search(nums, 0, nums.length - 1);
    }
    public int bin_search(int[] nums, int l, int r){
        if(l == r) return l;
        int mid = (l + r) / 2;
        if(nums[mid] > nums[mid + 1]) return bin_search(nums, l, mid);
        return bin_search(nums, mid + 1, r);
    }
}
// Better than 100% of the online solutions
// Time complexity is O(logn)
// Space comlexity is O(1)
