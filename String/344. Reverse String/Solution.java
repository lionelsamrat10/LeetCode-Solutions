class Solution {
    public void reverseString(char[] s) {
        int lowIndex = 0, highIndex = s.length - 1;
        while(lowIndex < highIndex){
            char temp = s[lowIndex];
            s[lowIndex] = s[highIndex];
            s[highIndex] = temp;
            
            lowIndex++;
            highIndex--;
        }
        //return s;
    }
}
