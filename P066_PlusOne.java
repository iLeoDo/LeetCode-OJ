/*
    https://leetcode.com/problems/plus-one/

    Given a non-negative number represented as an array of digits, plus one to 
    the number.

    The digits are stored such that the most significant digit is at the head 
    of the list.

    @tags: Array, Math
*/

public class P066_PlusOne{
	public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]==9){
                digits[i]=0;
            }else{
                digits[i]++;
                return digits;
            }
        }
        //move
        int[] res = new int[digits.length+1];
        res[0]=1;
        for(int i=1;i<digits.length+1;i++){
            res[i]=digits[i-1];
        }
        return res;
    }
}
