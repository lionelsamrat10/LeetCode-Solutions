class Solution {
    public String freqAlphabets(String s) {
        int len = s.length();
        StringBuilder builder = new StringBuilder();
        for(int i = len - 1 ; i >= 0 ; i--) {
            if (s.charAt(i) == '#') {
                int offset = (s.charAt(i - 1) - '0') + (s.charAt(i - 2) - '0') * 10;
                i = i - 2;
                builder.append((char) (offset + 'a' - 1));
            }
            else {
                char ch = (char) ((s.charAt(i) - '0' - 1) + 'a');
                builder.append(ch);
            }
        }
        return builder.reverse().toString();
    }
}
