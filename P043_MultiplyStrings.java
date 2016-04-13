/*
    https://leetcode.com/problems/multiply-strings/

    Given two numbers represented as strings, return multiplication of the
    numbers as a string.

    Note: The numbers can be arbitrarily large and are non-negative.

    @tags: Math, String
*/

public class P43_MultiplyStrings {
    public String multiply(String num1, String num2) {
        if(num1.length()==0) return num2;
        if(num2.length()==0) return num1;
        if(num1.equals("0")||num2.equals("0")) return "0";

        int[] digits = new int[num1.length()+num2.length()];

        int carry = 0;
        for(int i=0; i< digits.length;i++){
            digits[i] = carry;
            for(int j = i; j>=0;j--){
                digits[i] = digits[i] + getDigit(num1,j) * getDigit(num2,i-j);
            }
            carry = digits[i]/10;
            digits[i] = digits[i]%10;
        }

        StringBuilder sb = new StringBuilder();
        boolean leadingZero = true;
        for(int d = digits.length-1; d>=0; d--){
            if(digits[d]==0){
                if(leadingZero){
                    leadingZero = false;
                    continue;
                }else{
                    sb.append(digits[d]);
                }
            }else{
                leadingZero = false;
                sb.append(digits[d]);
            }
        }
        return sb.toString();

    }

    // return 0 when target digit not exist
    private int getDigit(String num, int d){
        if(d >= num.length()){
            return 0;
        }else{
            return num.charAt(num.length()-1-d)-'0';
        }
    }

}
