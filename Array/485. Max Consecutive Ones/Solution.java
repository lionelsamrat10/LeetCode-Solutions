class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int res = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0) count = 0;
            else{
                count++;
                res = Math.max(res, count);
            }
        }
        return res;
    }
}
//O(n) Solution by Samrat Mitra
