public class P43_MultiplyStrings {
    public String multiply(String num1, String num2) {
        if(num1.length()==0){ return num2; }
        if(num2.length()==0){ return num1; }
        if(num1.equals("0")||num2.equals("0")){ return "0"; }
        
        int[] digits = new int[num1.length()+num2.length()];

        // calculate by digit
        int carry = 0;
        for(int i = 0;i<digits.length;i++){
            int count = i;
            digits[i] = carry;
            for(int j = i;j>=0;j--){
                digits[i] = digits[i]
                            +getDigitForString(num2,j)
                            *getDigitForString(num1,count-j);
            }
            carry= digits[i]/10;
            digits[i]=digits[i]%10;
        }
        
        // build string;
        StringBuilder result = new StringBuilder();
        result.ensureCapacity(digits.length);
        for(int i = digits.length-1; i>=0;i--){
            result.append(digits[i]);
        }
        
        // check leading 0
        int i = 0;
        for(; i<result.length();i++){
            if(result.charAt(i)!='0')
                return result.substring(i);
        }
        return "0";
    }
    
    // return 0 when target digit not exist
    private int getDigitForString(String s, int digit){
        if(digit>=s.length()){
            return 0;
        }else{
            return s.charAt(s.length()-1-digit)-'0';
        }
    }
}
