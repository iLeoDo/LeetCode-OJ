/*
    https://leetcode.com/problems/valid-parentheses/

    Given a string containing just the characters '(', ')', '{', '}', '[' and 
    ']', determine if the input string is valid.

    The brackets must close in the correct order, "()" and "()[]{}" are all 
    valid but "(]" and "([)]" are not.

    @tags: Stack, String
*/

public class P020_ValidParentheses{
    public boolean isValid(String s) {
        if(s==null||s.isEmpty()){
            return true;
        }
        Stack<Integer> stack = new Stack();
        for(int i=0; i<s.length(); i++){
            int code = "()[]{}".indexOf(s.charAt(i));
            if(code%2==0){
                stack.push(code);
            }else{
                if(stack.empty()||stack.pop()!=code-1)
                    return false;
            }
        }
        return stack.empty();
    }
}
