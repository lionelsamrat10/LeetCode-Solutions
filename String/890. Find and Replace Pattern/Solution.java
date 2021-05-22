class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList();
        for (String word: words){
            if (match(word, pattern)){
                ans.add(word);
            }
        }    
        return ans;
    }

    public boolean match(String word, String pattern) {
        Map<Character, Character> mp1 = new HashMap();
        Map<Character, Character> mp2 = new HashMap();

        for (int i = 0; i < word.length(); ++i) {
            char w = word.charAt(i);
            char p = pattern.charAt(i);
            if (!mp1.containsKey(w)) {
                mp1.put(w, p);
            }
            if (!mp2.containsKey(p)) {
                mp2.put(p, w);
            }
            if (mp1.get(w) != p || mp2.get(p) != w)
                return false;
        }

        return true;
    }
}

// Runtime: 1 ms, faster than 90.67% of Java online submissions for Find and Replace Pattern.
// Memory Usage: 38.7 MB, less than 87.33% of Java online submissions for Find and Replace Pattern.
