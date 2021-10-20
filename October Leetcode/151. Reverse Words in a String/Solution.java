class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split(" +");
        StringBuilder str = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--)
            str.append(words[i] + " ");
        str.deleteCharAt(str.length() - 1); // Deleting the last added space
        return str.toString();
    }
}
