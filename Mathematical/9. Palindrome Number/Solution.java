class Solution {
    public boolean isPalindrome(int x) {
        String numeroString = "" + x;
        boolean ePalindromo = true;
        int tam = numeroString.length();
        for (int i = 0; i < tam; i++) {
            if (numeroString.charAt(i) != numeroString.charAt(tam - 1 - i)) {
                ePalindromo = false;
                i = tam;
            }
        }
        return ePalindromo;
    }
}