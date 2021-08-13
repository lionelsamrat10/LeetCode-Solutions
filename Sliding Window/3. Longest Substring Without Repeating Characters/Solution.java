class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) return 0;
        int max = 1, left = 0, right = 0;
        HashSet<Character> hs = new HashSet<>();
        for(right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            while(hs.contains(ch)) {
                hs.remove(s.charAt(left++));
            }
            hs.add(ch);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
