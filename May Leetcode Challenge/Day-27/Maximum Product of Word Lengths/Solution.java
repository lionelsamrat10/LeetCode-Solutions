class Solution {
    public static int maxProduct(String[] words) {
        int result = 0;
        int[] binaryWords = Arrays.stream (words).mapToInt (word -> binaryString (word)).toArray();
        for (int leftIndex = 0; leftIndex < binaryWords.length; leftIndex++) {
            for (int rightIndex = 1; rightIndex < binaryWords.length; rightIndex++) {
                if((binaryWords[leftIndex] & binaryWords[rightIndex])==0)
                    result = Math.max (result, words[leftIndex].length()*words[rightIndex].length());
            }
        }
	return result;
}

public static int binaryString(String word){
	int value = 0;
    for(Character character : word.toCharArray ()){
		value |= 1 << character-'a';
    }
    return value;
}
}
