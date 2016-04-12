/*
    https://leetcode.com/problems/longest-common-prefix/

    Write a function to find the longest common prefix string amongst an array 
    of strings.

    @tags: String
*/

public class P14_LongestCommonPrefix{
	public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        int max = strs[0].length();
        for(int i = 1; i<strs.length;i++){
            String current = strs[i];
            String prev = strs[i-1];
            
            int currentLen = current.length();
            for(int j = 0;j<Math.min(max,currentLen);j++){
                
                if(prev.charAt(j)!=current.charAt(j)){
                    currentLen=j;
                }
            }
            max = Math.min(max,currentLen);
        }
        return strs[0].substring(0,max);
    }
}
