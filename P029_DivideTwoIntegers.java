/*
    https://leetcode.com/problems/divide-two-integers/

    Divide two integers without using multiplication, division and mod operator.

    If it is overflow, return MAX_INT.

    @tags: Math, Binary Search
*/

public class P029_DivideTwoIntegers{
	public int divide(int dividend, int divisor) {
        long longDividend = (long)dividend;
        long longDivisor = (long)divisor;
        boolean sign = (dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0) ;
        longDividend = Math.abs(longDividend);
        longDivisor= Math.abs(longDivisor);
        
        if (longDividend < longDivisor) {
            return 0;
        }
        
        long div = longDivisor;
        long multip = 1;
        while (longDividend>=(div<<1)) {
            multip = multip << 1;
            div = div << 1;
        }
        
        long value = multip;
        longDividend = longDividend-div;
        
        while(div>=longDivisor){
            if(longDividend>=div){
                longDividend = longDividend-div;
                value = value + multip;
            }else{
                div = div>>1;
                multip = multip>>1;
            }
        }
        return (sign)?(int)Math.min(value, Integer.MAX_VALUE):(int)-value;
    }
}
