/*
    https://leetcode.com/problems/reverse-words-in-a-string-ii/

    Given an input string, reverse the string word by word. A word is defined as 
    a sequence of non-space characters.

    The input string does not contain leading or trailing spaces and the words 
    are always separated by a single space.

    For example,
    Given s = "the sky is blue",
    return "blue is sky the".

    Could you do it in-place without allocating extra space?

    Related problem: Rotate Array

    @tags: String
*/

public class P186_ReverseWordsInAStringII{
    public void reverseWords(char[] s) {
        reverse(s,0,s.length-1);
        for(int i=0;i<s.length;i++){
            if(s[i]!=' '){
                int j = i+1;
                while(j<s.length&&s[j]!=' '){
                    j++;
                }
                reverse(s,i,j-1);
                i = j-1;
            }
        }
        // removeSpaces(s); // only if necessary
    }

    private void removeSpaces(char[] chars){
        int current = 0;
        int begin = 0;
        while(begin<chars.length&&chars[begin]==' '){
            begin++;
        }
        int end = chars.length-1;
        while(end>=0&&chars[end]==' '){
            end--;
        }
        if(begin>end){
            return;
        }
        int counter = 0;
        for(int i = begin;i<=end;i++){
            char c = chars[i];
            if(c==' '){
                counter++;
                if(counter==1){
                    //first space;
                    chars[current] = chars[i];
                    current++;
                }else{
                    //nothing;
                }
            }else{
                counter=0;
                chars[current] = chars[i];
                current++;
            }
        }
        for(int i=current;i<chars.length;i++){
            chars[i] = 0;
        }
    }

    private void reverse(char[] chars, int lo, int hi){
        while(lo<hi){
            char tmp = chars[lo];
            chars[lo] = chars[hi];
            chars[hi] = tmp;
            lo++;
            hi--;
        }
    }
}
