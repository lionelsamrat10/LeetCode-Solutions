class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=0, j=n;
        int[] ans = new int[n * 2];
        for(int k=0; k<nums.length; k++) {
            if(k % 2 == 0) ans[k] = nums[i++];
            else if(k % 2 != 0) ans[k] = nums[j++];
        }
        return ans;
    }
}
