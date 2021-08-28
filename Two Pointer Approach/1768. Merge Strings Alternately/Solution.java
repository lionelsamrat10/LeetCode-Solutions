class Solution {
    public String mergeAlternately(String word1, String word2) {
        int length1 = word1.length(), length2 = word2.length();
        char merged[] = new char[length1 + length2];
        int ptr1=0, ptr2 = 0, mergedPtr = 0;
        while(ptr1 < length1 || ptr2 < length2) {
            if(ptr1 < length1) merged[mergedPtr++] = word1.charAt(ptr1++);
            if(ptr2 < length2) merged[mergedPtr++] = word2.charAt(ptr2++);
        }
        return new String(merged);
    }
}
// O(n) Time
