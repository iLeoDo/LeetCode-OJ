/*
    https://leetcode.com/problems/reverse-words-in-a-string/

    Given an input string, reverse the string word by word.

    For example,
    Given s = "the sky is blue",
    return "blue is sky the".

    Update (2015-02-12):
    For C programmers: Try to solve it in-place in O(1) space.

    --------------------------------
    Clarification:
    What constitutes a word?
    A sequence of non-space characters constitutes a word.

    Could the input string contain leading or trailing spaces?
    Yes. However, your reversed string should not contain leading or trailing spaces.

    How about multiple spaces between two words?
    Reduce them to a single space in the reversed string.

    @tags: String
*/

public class P151_ReverseWordInString{
    public String reverseWords(String s) {
        int i = s.length()-1;
        // buffer for current word
        StringBuilder word = new StringBuilder();
        // builder for final result
        StringBuilder result = new StringBuilder();
        while(i>=0){
            char c = s.charAt(i);
            if(c==' '){
                if(word.length()>0){
                    result.append(" "+word);
                    word = new StringBuilder();
                }
            }else{
                word.insert(0,c);
            }
            i--;
        }
        //if there is still something in word.
        if(word.length()>0){
            result.append(" "+word.toString());
        }

        if(result.length()==0){
            return "";
        }

        return result.substring(1);
    }

    /**
     * Simple Version
     */
    public String reverseWords(String s) {
        Scanner sc = new Scanner(s);
        StringBuilder sb = new StringBuilder();
        while(sc.hasNext()){
            sb.insert(0,sc.next()+" ");
        }
        return sb.toString().trim();
    }

    /**
     * Pseudo In-Place
     */
    public String reverseWords(String s) {
        char[] string = s.toCharArray();
        reverse(string,0,string.length-1);
        for(int i=0;i<string.length;i++){
            if(string[i]!=' '){
                int j = i+1;
                while(j<string.length&&string[j]!=' '){
                    j++;
                }
                reverse(string,i,j-1);
                i = j-1;
            }
        }
        return removeSpaces(string);

    }

    private String removeSpaces(char[] chars){
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
            return new String("");
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
        return new String(chars,0,current);
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
