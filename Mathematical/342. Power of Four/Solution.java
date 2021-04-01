//Author: Samrat Mitra
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 0) return false;
        
        while(n != 1){
            if(n % 4 != 0) return false;
            n /= 4;
        }
        return true;
    }
}
//Runtime: 1 ms, faster than 99.23% of Java online submissions for Power of Four.
//Memory Usage: 35.8 MB, less than 79.80% of Java online submissions for Power of Four.
