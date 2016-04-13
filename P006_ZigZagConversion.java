/*
    https://leetcode.com/problems/zigzag-conversion/

    The string "PAYPALISHIRING" is written in a zigzag pattern on a given number
     of rows like this: (you may want to display this pattern in a fixed font
     for better legibility)

    P   A   H   N
    A P L S I I G
    Y   I   R
    And then read line by line: "PAHNAPLSIIGYIR"
    Write the code that will take a string and make this conversion given a
    number of rows:

    string convert(string text, int nRows);
    convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".

    @tags: String
*/

public class P006_ZigZagConversion{
	public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }

        StringBuilder[] builders = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            builders[i] = new StringBuilder();
        }

        int lengthOfGroup = 2*(numRows-1);
        int midInGroup = numRows-1;
        for(int i=0;i<s.length();i++){
            int index = i%lengthOfGroup;
            builders[midInGroup-Math.abs(index-midInGroup)].append(s.charAt(i));
        }

        StringBuilder result = new StringBuilder(numRows*(builders[0].length()+1));
        for(StringBuilder sb : builders){
            result.append(sb.toString());
        }
        return result.toString();

    }
}

