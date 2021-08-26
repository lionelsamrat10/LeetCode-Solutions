class Solution {
    static int NO_OF_CHARS = 256;
    public boolean isAnagram(String s, String t) {
        int count1[] = new int[NO_OF_CHARS];
        Arrays.fill(count1, 0);
        int count2[] = new int[NO_OF_CHARS];
        Arrays.fill(count2, 0);
        int i;
        
        for (i = 0; i < s.length() && i < t.length(); i++) {
            count1[s.charAt(i)]++;
            count2[t.charAt(i)]++;
        }
        
        if (s.length() != t.length())
            return false;
        for (i = 0; i < NO_OF_CHARS; i++)
            if (count1[i] != count2[i])
                return false;
        return true;
    }
}
