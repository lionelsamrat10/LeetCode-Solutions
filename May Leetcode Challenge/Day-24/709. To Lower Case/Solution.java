class Solution {
    public String toLowerCase(String s) {
        char[] charArray = s.toCharArray();
        String ans = "";
        for(short i = 0; i < charArray.length; i++){
            if(charArray[i] >= 'A' && charArray[i] <= 'Z')
                ans += (char)(charArray[i] + 32);
            else
                ans += charArray[i];
        }
        return ans;
    }
}
