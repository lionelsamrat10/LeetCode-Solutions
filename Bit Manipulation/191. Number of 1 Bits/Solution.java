//Author: Samrat Mitra
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res = 0;
        while(n != 0){
            res++;
            n &= (n - 1);
        }
        return res;
    }
}
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of 1 Bits.
//Memory Usage: 36 MB, less than 52.51% of Java online submissions for Number of 1 Bits.
