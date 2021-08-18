class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        return bin_search(arr, 0, arr.length - 1);
    }
    public int bin_search(int[] arr, int l, int r) {
        if(l == r) return l;
        int mid = (l + r) / 2;
        if(arr[mid] > arr[mid + 1]) return bin_search(arr, l, mid);
        return bin_search(arr, mid + 1, r);
    }
}
