class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int evenIdx = 0, oddIdx = 1;
        while(evenIdx < nums.length && oddIdx < nums.length) {
            if(isEvenOdd(nums[evenIdx])) evenIdx += 2;
            if(!isEvenOdd(nums[oddIdx])) oddIdx += 2;
            else {
                int temp = nums[evenIdx];
                nums[evenIdx] = nums[oddIdx];
                nums[oddIdx] = temp;
            }
        }
        return nums;
    }
    // Returns true if the number even and false when its odd
    public boolean isEvenOdd(int num) {
        return num % 2 == 0 ? true : false;
    }
}
// O(n)
