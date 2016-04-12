/*
    https://leetcode.com/problems/palindrome-number/

    Determine whether an integer is a palindrome. Do this without extra space.

    --------------------------------
    Some hints:
    Could negative integers be palindromes? (ie, -1)

    If you are thinking of converting the integer to string, note the 
    restriction of using extra space.

    You could also try reversing an integer. However, if you have solved the 
    problem "Reverse Integer", you know that the reversed integer might 
    overflow. How would you handle such case?

    There is a more generic way of solving this problem.

    @tags: Math
*/

public class P009_PalindromeNumber{
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int length = 0;
        // get length of integer
        for(int copy=x;copy>0;copy/=10){
            length++;
        }

        while(length>1){
            // compare front and real digits of integer
            if(x/(int)Math.pow(10,length-1) != x%10){
                return false;
            }
            // remove front and real digits
            x = x%(int)Math.pow(10,length-1)/10;
            length = length-2;
        }
        return true;
    }
}
