class Solution {

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = binarySearch(nums,target,true);
        ans[1] = binarySearch(nums,target,false);
        return ans;
    }
    
    public int binarySearch(int[] nums,int target, boolean StartIndex){
        int st=0,en=nums.length-1;
        int ans = -1;
        while(st<=en){
            int mid = st + (en-st)/2;
            if(nums[mid]>target){
                en = mid-1;
            }
            else if(nums[mid]<target){
                st = mid+1;
            }
            else{
                ans = mid;
                if(StartIndex){
                    en = mid-1;
                } else{
                    st = mid+1;
                }
            }
        }
        return ans;
    }
}
