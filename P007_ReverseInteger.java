/*
    https://leetcode.com/problems/reverse-integer/

    Reverse digits of an integer.

    Example1: x = 123, return 321
    Example2: x = -123, return -321

    --------------------------------
    Have you thought about this?
    Here are some good questions to ask before coding. Bonus points for you if 
    you have already thought through this!

    If the integer's last digit is 0, what should the output be? ie, cases such 
    as 10, 100.

    Did you notice that the reversed integer might overflow? Assume the input is
     a 32-bit integer, then the reverse of 1000000003 overflows. How should you 
     handle such cases?

    For the purpose of this problem, assume that your function returns 0 when 
    the reversed integer overflows.

    Update (2014-11-10):
    Test cases had been added to test the overflow behavior.

    @tags: Math
*/

public class P007_ReverseInteger{
    public int reverse(int x) {
        //position
        boolean pos = x>=0;
        // absolute value
        int abs = x>=0?x:-x;
        int reverse = 0;

        while(abs>0){
            // old reverse value prepared for overflow check
            int oldRev = reverse;

            reverse = reverse*10+abs%10;

            // overflow check
            if((reverse-abs%10)/10!=oldRev){
                return 0;
            }

            abs = abs/10;

        }
        return pos?reverse:(-reverse);
    }

}
