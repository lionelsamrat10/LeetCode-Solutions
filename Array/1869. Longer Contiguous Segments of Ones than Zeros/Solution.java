class Solution {
    public boolean checkZeroOnes(String s) {
        int segmentOfZeroes = 0, segmentOfOnes = 0, currentZeroes = 0, currentOnes = 0;
        for(char ch: s.toCharArray()){
            if(ch == '0'){
                currentZeroes++;
                segmentOfZeroes = Math.max(segmentOfZeroes, currentZeroes);
                currentOnes = 0;
            } else{
                currentOnes++;
                segmentOfOnes = Math.max(segmentOfOnes, currentOnes);
                currentZeroes = 0;
            }
        }
        return segmentOfZeroes < segmentOfOnes;
    }
}

// Time Complexity: O(n) where n is the number of elements in the array.
// Space Complexity: O(1) because no extra space is needed here.
