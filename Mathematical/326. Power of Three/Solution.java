//Author: Samrat Mitra
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n == 0) return false;
        
        while(n != 1){
            if(n % 3 != 0) return false;
            
            n /= 3;
        }
        return true;
    }
}
//Runtime: 11 ms, faster than 64.64% of Java online submissions for Power of Three.
//Memory Usage: 38.3 MB, less than 95.75% of Java online submissions for Power of Three.
