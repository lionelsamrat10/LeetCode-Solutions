//Author: Samrat Mitra
//O(logn) solution using Binary Search
class Solution {
    //Finds the first occurance of the target element in the sorted array
    public static int first_occurance(int arr[], int low, int high, int target)
    {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if ((mid == 0 || target > arr[mid - 1]) && arr[mid] == target)
                return mid;
            else if (target > arr[mid])
                return first_occurance(arr, (mid + 1), high, target);
            else
                return first_occurance(arr, low, (mid - 1), target);
        }
        //if not found then return -1
        return -1;
    }
    //Finds the last occurance of the target element in the sorted array
    public static int last_occurance(int arr[], int low, int high, int target)
    {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if ((mid == arr.length - 1 || target < arr[mid + 1]) && arr[mid] == target)
                return mid;
            else if (target < arr[mid])
                return last_occurance(arr, low, (mid - 1), target);
            else
                return last_occurance(arr, (mid + 1), high, target);
        }
        return -1;
    }
    
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        int low = 0, high = nums.length - 1;
        res[0] = first_occurance(nums, low, high, target);
        res[1] = last_occurance(nums, low, high, target);
        return res;
    }
}
