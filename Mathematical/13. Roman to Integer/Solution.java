class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int previousValue = 1001;
        int currentValue = 0;
            
        for (char c : s.toCharArray()) {
            switch (c) {
                case 'I': currentValue = 1; break;
                case 'V': currentValue = 5; break;
                case 'X': currentValue = 10; break;
                case 'L': currentValue = 50; break;
                case 'C': currentValue = 100; break;
                case 'D': currentValue = 500; break;
                case 'M': currentValue = 1000; break;
            }
            
            sum += currentValue;
            
            if (previousValue < currentValue) {
                sum -= 2 * previousValue;
            }
            
            previousValue = currentValue;
        }
        return sum;
    }
}
