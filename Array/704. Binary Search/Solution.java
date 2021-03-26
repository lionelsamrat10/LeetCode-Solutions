//Author: Samrat Mitra
//T(n) = O(logn)
class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            
            //If target is lesser than the mid element
            if(nums[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
            //Best case
            if(nums[mid] == target)
            return mid;
        }
        return -1;
    }
}
