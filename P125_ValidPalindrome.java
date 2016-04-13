/*
    https://leetcode.com/problems/valid-palindrome/

    Given a string, determine if it is a palindrome, considering only 
    alphanumeric characters and ignoring cases.

    For example,
    "A man, a plan, a canal: Panama" is a palindrome.
    "race a car" is not a palindrome.

    Note:
    Have you consider that the string might be empty? This is a good question to 
    ask during an interview.

    For the purpose of this problem, we define empty string as valid palindrome.

    @tags: Two Pointers, String
*/

public class P125_ValidPalindrome{
	public boolean isPalindrome(String s) {
        if(s==null||s.length()==0){
            return true;
        }
        
        int start=0;
        int end =s.length()-1;
        
        while(start<end){
            if(!Character.isLetterOrDigit(s.charAt(start))){
                start++;
                continue;
            }
            
            if(!Character.isLetterOrDigit(s.charAt(end))){
                end--;
                continue;
            }
            
            if(Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end))){
                return false;
            }else{
                start++;
                end--;
            }
        }
        return true;
    }
}
