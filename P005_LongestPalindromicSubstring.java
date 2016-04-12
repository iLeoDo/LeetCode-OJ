/*
    https://leetcode.com/problems/longest-palindromic-substring/

    Given a string S, find the longest palindromic substring in S. You may 
    assume that the maximum length of S is 1000, and there exists one unique 
    longest palindromic substring.

    @tags: String
*/

public class P005_LongestPalindromicSubstring{
    public String longestPalindrome(String s) {
        if(s==null||s.equals("")){
            return "";
        }
        if(s.length()<=1){
            return s;
        }

        int[] indexes = new int[2];
        int maxLen = 0;
        for(int i=0;i<s.length()-1;i++){
            int[] odd = longestPalindromeHelper(s,i,i);
            if(odd[1]-odd[0]+1>maxLen){
                indexes = odd;
                maxLen = odd[1]-odd[0]+1;
            }
            int[] even = longestPalindromeHelper(s,i,i+1);
            if(even[1]-even[0]+1>maxLen){
                indexes = even;
                maxLen = even[1]-even[0]+1;
            }
        }
        return s.substring(indexes[0],indexes[1]+1);
    }

    private int[] longestPalindromeHelper(String s, int left, int right){
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return new int[]{left+1,right-1};
    }
}
