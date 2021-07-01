class Solution {
    public int removeElement(int[] nums, int val) {
        int low = 0, high = nums.length;
        while(low < high){
            if(nums[low] == val){
                nums[low] = nums[high - 1];
                high--;
            }else{
                low++;
            } 
        }
        return high;
    }
}
