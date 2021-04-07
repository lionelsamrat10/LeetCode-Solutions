class Solution {
    public boolean halvesAreAlike(String s) {
        int mid = s.length() / 2;
        char[] cArray = s.toCharArray();
        
        int diffCnt = 0;
        
        for(int i=0; i<mid; i++){
            if(isVowel(cArray[i])){
                diffCnt++;
            }
            if(isVowel(cArray[mid + i])){
                diffCnt--;
            }
        }
        return diffCnt == 0;
    }
    
    public boolean isVowel(char ch){
         return ch == 'a' 
             || ch == 'e' 
             || ch =='i' 
             || ch == 'o' 
             || ch == 'u' 
             || ch == 'A' 
             || ch == 'E' 
             || ch == 'I' 
             || ch == 'O' 
             || ch == 'U'; 
    }
}
