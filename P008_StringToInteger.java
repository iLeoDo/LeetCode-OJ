/*
    https://leetcode.com/problems/string-to-integer-atoi/

    Implement atoi to convert a string to an integer.

    Hint: Carefully consider all possible input cases. If you want a challenge,
     please do not see below and ask yourself what are the possible input cases.

    Notes: It is intended for this problem to be specified vaguely (ie, no given
     input specs). You are responsible to gather all the input requirements up 
     front.

    Update (2015-02-10):
    The signature of the C++ function had been updated. If you still see your 
    function signature accepts a const char * argument, please click the reload 
    button  to reset your code definition.

    --------------------------------
    Requirements for atoi:
    The function first discards as many whitespace characters as necessary until 
    the first non-whitespace character is found. Then, starting from this 
    character, takes an optional initial plus or minus sign followed by as many
     numerical digits as possible, and interprets them as a numerical value.


    The string can contain additional characters after those that form the 
    integral number, which are ignored and have no effect on the behavior of 
    this function.

    If the first sequence of non-whitespace characters in str is not a valid 
    integral number, or if no such sequence exists because either str is empty 
    or it contains only whitespace characters, no conversion is performed.

    If no valid conversion could be performed, a zero value is returned. If the 
    correct value is out of the range of representable values, INT_MAX 
    (2147483647) or INT_MIN (-2147483648) is returned.

    @tags: Math, String
*/

public class P008_StringToInteger{

    public int myAtoi(String str) {
        str = str.trim();
        if(str.length()==0){
            return 0; //error
        }

        int result = 0;
        boolean flag = true;

        char ch = str.charAt(0);
        if(ch=='-'){
            flag = false;
        }else if(ch=='+'){
            flag = true;
        }else if(ch>='0'&&ch<='9'){
            result = ch-'0';
        }else{
            return 0; //error
        }

        for(int i=1;i<str.length();i++){
            ch = str.charAt(i);
            if(ch<'0'||ch>'9'){
                break;
            }

            int original = result;
            //condition of overflow
            if(Integer.MAX_VALUE/10 < original||(Integer.MAX_VALUE/10 == original && ch-'0'>Integer.MAX_VALUE%10)){
                return flag?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }

            result = original*10 + (ch-'0');

        }
        return flag?result:-result;
    }
}
