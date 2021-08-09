class Solution {
    public String addStrings(String num1, String num2) {
        if(num1.equals("0") && num2.equals("0")) return "0";
        String ans=""; 
        int carry=0;
        int i=num1.length()-1;
        int j=num2.length()-1;
        
        while(i>=0 || j>=0 || carry!=0) {
            int val_i = i >= 0 ? num1.charAt(i) - '0' : 0;
            int val_j = j >= 0 ? num2.charAt(j) - '0' : 0;
            i--;
            j--;
            int sum = val_i + val_j + carry;
            carry = sum / 10;
            ans += sum % 10;
        }
        return reverse(ans);
    }
    public static String reverse(String str){  
        char ch[]=str.toCharArray();  
        String rev="";  
        for(int i=ch.length-1;i>=0;i--){  
            rev+=ch[i];  
        }  
        return rev;  
    }  
}
