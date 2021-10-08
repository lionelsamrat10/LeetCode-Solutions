public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double[] nums = new double[nums1.length + nums2.length];
        concat(nums, nums1, nums2);
        quicksort(0, nums.length - 1, nums);
        return median(nums);
    }

    public void concat(double[] nums, int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) {
            nums[i] = nums1[i];
        }
        for (int i = nums1.length; i < nums1.length + nums2.length; i++) {
            nums[i] = nums2[i - nums1.length];
        }
    }

    public void quicksort(int esq, int dir, double[] nums) {
        int i = esq, j = dir;
        double pivo = nums[(esq + dir) / 2];
        while (i <= j) {
            while (nums[i] < pivo)
                i++;
            while (nums[j] > pivo)
                j--;
            if (i <= j) {
                double aux = nums[i];
                nums[i] = nums[j];
                nums[j] = aux;
                i++;
                j--;
            }
        }
        if (esq < j)
            quicksort(esq, j, nums);
        if (i < dir)
            quicksort(i, dir, nums);
    }

    public double median(double[] nums) {
        double median = 0.0;
        int length = nums.length;
        if (length % 2 == 0) {
            median = (nums[length / 2] + nums[(length - 1) / 2]) / 2;
        } else {
            median = nums[(length) / 2];
        }
        return median;
    }
}