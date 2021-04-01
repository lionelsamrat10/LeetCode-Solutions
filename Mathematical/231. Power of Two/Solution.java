//Author: Samrat Mitra
class Solution {
    public boolean isPowerOfTwo(int n) {
        //if n = 0 return false
        if(n == 0) return false;
        while(n != 1){
            if(n % 2 != 0) return false;
            n /= 2;
        }
        return true;
    }
}
//Runtime: 1 ms, faster than 99.97% of Java online submissions for Power of Two.
//Memory Usage: 36 MB, less than 67.15% of Java online submissions for Power of Two.
