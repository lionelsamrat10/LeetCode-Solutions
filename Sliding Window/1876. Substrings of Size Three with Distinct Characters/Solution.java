class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length() < 3) return 0;
        int count = 0;
        for(int i=2; i<s.length(); i++) {
            char char1 = s.charAt(i - 2);
            char char2 = s.charAt(i - 1);
            char char3 = s.charAt(i);
            
            if(char1 != char2 && char2 != char3 && char3 != char1) count++;
        }
        return count;
    }
}
// Time Complexity: O(n)
// Used Sliding Window Approach
