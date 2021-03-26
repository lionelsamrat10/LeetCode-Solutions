class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] result = new int[encoded.length + 1];
        result[0] = first;
        
        for(int i=0; i<encoded.length; i++){
            result[i+1] = result[i] ^ encoded[i];
        }
        
        return result;
    }
}
//Runtime: 1 ms, faster than 100.00% of Java online submissions for Decode XORed Array. T(n) = O(n)
//Memory Usage: 39.9 MB, less than 62.39% of Java online submissions for Decode XORed Array.
