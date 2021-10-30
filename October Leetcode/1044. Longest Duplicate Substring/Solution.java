class Solution {
    public String longestDupSubstring(String S) {
        char[] sc = S.toCharArray();
        
        // Check if there aren't any duplicate substrings.  There can 
        // only be no duplicates if the string does not have more than 
        // one occurrence of any character in the string.  Since the 
        // string only contains lowercase characters, the string 
        // length must be less than 26 characters, otherwise at least 
        // one character must be duplicated.
        int longestSubstringIdx = 0;
        int longestSubstringLen = 0;
        int[] found = new int[26];
        for (int i = sc.length - 1; i >= 0; i--) {
            if (found[sc[i] - 'a']++ > 0) {
                longestSubstringIdx = i;
                longestSubstringLen = 1;
                break;
            }
        }
        if (longestSubstringLen == 0)  return "";
        
        // Check for the same character over a large contiguous area.  
        // If we find a long repeat of the same character, then we can 
        // use this to set a minimum length for the longest duplicate 
        // substring, and therefore we don't have to check any shorter 
        // substrings.
        for (int i = sc.length - 1; i > 0; i--) {
            if (sc[i] == sc[i - 1]) {
                char c = sc[i];
                int startI = i;
                int reptCount = 2;
                for (i = i - 2; i >= 0 && sc[i] == c; i--) { }
                i++;
                if (startI - i > longestSubstringLen) {
                    longestSubstringLen = startI - i;
                    longestSubstringIdx = i + 1;
                }
            }
        }
        if (longestSubstringLen == sc.length - 1)  return S.substring(0, longestSubstringLen);

        // Build a table of two-charactar combined values for the 
        // passed String.  These combined values are formed for any 
        // index into the String, by the character at the current 
        // index reduced to the range [0..25] times 26, plus the 
        // next character in the string reduced to the range [0..25].  
        // This combined value is used to index into the array 
        // twoCharHead[], which contains the index into the string of 
        // the first character pair with this combined value, which is 
        // also used to index into the array twoCharList[].  The 
        // twoCharList[] array is a "linked list" of String indexes 
        // that have the same combined values for a character pair.
        //
        // To look up all character pairs with the same combined 
        // value N, start at twoCharHead[N].  This will give the 
        // String index X of the first character pair with that 
        // combined value.  To find successive String indexes, lookup 
        // in twoCharList[X] to get the new String index X.  Then 
        // repeatedly lookup new X values in twoCharList[X], until 
        // X equals zero, which indicates the end of the character 
        // pairs with the same combined value.
        short[] twoCharHead = new short[26 * 26];
        short[] twoCharList = new short[sc.length + 1];
        for (int i = sc.length - longestSubstringLen - 1; i > 0; i--) {
            int twoCharNum = (sc[i] - 'a') * 26 + sc[i + 1] - 'a';
            twoCharList[i] = twoCharHead[twoCharNum];
            twoCharHead[twoCharNum] = (short)i;
        }
        
        // Search the String for matching substrings that are longer 
        // than the current longest substring found.  Start at the 
        // beginning of the string, and successively get a character 
        // pair's combined value.  Use that character pair's combined 
        // value to find all other character pair's with the same 
        // combined value.  In the process, remove any character pairs 
        // that occur in the String before the current character pair.  
        // For two character pairs that appear that they may be a 
        // possible matching substring longer than the currently 
        // longest found match, then test to see if the substrings 
        // match.
        int curIdxLimit = sc.length - longestSubstringLen - 1;
        for (int i = 0; i <= curIdxLimit; i++) {
            int twoCharNum = (sc[i] - 'a') * 26 + sc[i + 1] - 'a';
            while (twoCharHead[twoCharNum] <= i && twoCharHead[twoCharNum] != 0)
                twoCharHead[twoCharNum] = twoCharList[twoCharHead[twoCharNum]];
            int compIdx = twoCharHead[twoCharNum];
            while (compIdx != 0 && compIdx <= curIdxLimit) {
                if (sc[i + longestSubstringLen] == sc[compIdx + longestSubstringLen] && 
                            sc[i + longestSubstringLen / 2] == sc[compIdx + longestSubstringLen / 2]) {
                    int lowIdx = i + 2;
                    int highIdx = compIdx + 2;
                    while (highIdx < sc.length && sc[lowIdx] == sc[highIdx]) {
                        lowIdx++;
                        highIdx++;
                    }
                    if (lowIdx - i > longestSubstringLen) {
                        longestSubstringLen = lowIdx - i;
                        longestSubstringIdx = i;
                        curIdxLimit = sc.length - longestSubstringLen - 1;
                    }
                }
                compIdx = twoCharList[compIdx];
            }
        }
        
        return S.substring(longestSubstringIdx, longestSubstringIdx + longestSubstringLen);
    }
}
