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
        boolean sign = !(dividend > 0 ^ divisor > 0);
        longDividend = Math.abs(longDividend);
        longDivisor= Math.abs(longDivisor);

        if (longDividend < longDivisor) {
            return 0;
        }
        /**
         * 15 / 3 => 15 / 6 => 15 / 12
         */
        long div = longDivisor;
        long multip = 1;
        while (longDividend>=(div<<1)) {
            multip = multip << 1;
            div = div << 1;
        }
        /**
         * div = 12
         * multip = 4
         */

        long value = multip;
        longDividend = longDividend-div;

        /**
         * div = 12
         * longDivisor = 3
         * longDividend = 3
         */

        while(div>=longDivisor){
            if(longDividend>=div){
                longDividend = longDividend-div;
                value = value + multip;
            }else{
                div = div>>1;
                multip = multip>>1;
            }
        }

        // Integer.MIN_VALUE / -1
        return sign ? (int) Math.min(Integer.MAX_VALUE,value) : (int) -value;

    }
}
