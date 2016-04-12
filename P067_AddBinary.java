/*
    https://leetcode.com/problems/add-binary/

    Given two binary strings, return their sum (also a binary string).

    For example,
    a = "11"
    b = "1"
    Return "100".

    @tags: Math, String
*/

public class P67_AddBinary{
    public String addBinary(String a, String b) {
        int carry = 0;
        int[] result = new int[Math.max(a.length(),b.length())+1];
        for(int i=0;i<result.length;i++){
            result[i] = (getDigit(a,i)+getDigit(b,i)+carry)%2;
            carry = (getDigit(a,i)+getDigit(b,i)+carry)/2;
        }
        StringBuilder sb = new StringBuilder();
        sb.ensureCapacity(Math.max(a.length(),b.length())+1);
        for(int i=result.length-1;i>=0;i--){
            sb.append(result[i]);
        }
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)!='0'){
                return sb.substring(i);
            }
        }
        return "0";
        
    }
    
    public int getDigit(String s, int digit){
        if(digit>=s.length()){
            return 0;
        }else{
            return s.charAt(s.length()-1-digit)-'0';
        }
    }
}
