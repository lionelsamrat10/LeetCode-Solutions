class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;
        for(int i=0; i<arr1.length; i++) {
            int close = findClosest(arr2, arr1[i]);
            if(Math.abs(arr1[i] - close) > d) count++;
        }
        return count;
    }
    public int findClosest(int[] arr, int target) {
        int d = Integer.MAX_VALUE;
        int low = 0, high = arr.length - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == target) return arr[mid];
            else if(arr[mid] < target) low = mid + 1;
            else high = mid - 1;
            d = Math.abs(target - arr[mid]) < Math.abs(target - d) ? arr[mid] : d;
        }
        return d;
    }
}
