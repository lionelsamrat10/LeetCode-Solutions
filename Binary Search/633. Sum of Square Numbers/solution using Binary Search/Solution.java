public class Solution {
    public boolean judgeSquareSum(int c) {
        for (long a = 0; a * a <= c; a++) {
            // We have to check basically whether b is a perfect square number or not?
            int b = c - (int)(a * a);
            if (binary_search(0, b, b))
                return true;
        }
        return false;
    }
    // Checks whethet b is a perfect square number or not
    public boolean binary_search(long start, long end, int target) {
        if (start > end)
            return false;
        long mid = start + (end - start) / 2;
        if (mid * mid == target)
            return true;
        if (mid * mid > target)
            return binary_search(start, mid - 1, target);
        return binary_search(mid + 1, end, target);
    }
}
