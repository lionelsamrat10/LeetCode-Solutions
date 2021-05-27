// https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/
class Solution {
    public int minPartitions(String n) {
        // Think about if the input was only one digit. Then you need to add up as many ones as the value of this digit.
        // If the input has multiple digits, then you can solve for each digit independently, and merge the answers to form numbers that add up to that input.
        // Thus the answer is equal to the max digit.
        int max=0;
        for(int i=0;i<n.length();i++){
            int ch=n.charAt(i)-'0';
            max=Math.max(max,ch);
        }
        return max;
    }
}
