class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int low = 0, high = nums.length - 1;
        while(low < high) {
            if(nums[low] % 2 > nums[high] % 2){
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
            }
            if(isEvenOdd(nums[low]))
                low++;
            if(!isEvenOdd(nums[high]))
                high--;
        }
        return nums;
    }
    public boolean isEvenOdd(int num) {
        return num % 2 == 0 ? true : false;
    }
}

// O(n)  Solution
