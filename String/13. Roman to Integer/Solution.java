class Solution {
    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result += caracValue(s, i);
        }

        return result;
    }

    public int caracValue(String s, int index) {
        int value = 0;
        switch (s.charAt(index)) {
            case 'I':
                try {
                    if (s.charAt(index + 1) == 'V' || s.charAt(index + 1) == 'X') {
                        value = -1;
                    } else {
                        value = 1;
                    }
                } catch (IndexOutOfBoundsException ioobe) {
                    value = 1;
                }
                break;
            case 'V':
                value = 5;
                break;
            case 'X':
                try {
                    if (s.charAt(index + 1) == 'L' || s.charAt(index + 1) == 'C') {
                        value = -10;
                    } else {
                        value = 10;
                    }
                } catch (IndexOutOfBoundsException ioobe) {
                    value = 10;
                }
                break;
            case 'L':
                value = 50;
                break;
            case 'C':
                try {
                    if (s.charAt(index + 1) == 'D' || s.charAt(index + 1) == 'M') {
                        value = -100;
                    } else {
                        value = 100;
                    }
                } catch (IndexOutOfBoundsException ioobe) {
                    value = 100;
                }
                break;
            case 'D':
                value = 500;
                break;
            case 'M':
                value = 1000;
                break;
            default:
                System.err.println("ERROR!");
                break;
        }
        return value;
    }
}