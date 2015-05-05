
public class P006_ZigZagConversion{
	public String convert(String s, int nRows) {
        StringBuilder sb = new StringBuilder();
        int distance = 2*(nRows-1);
        if(distance==0){
        	return s;
        }
        for(int i = 0;i<nRows;i++){
            if(i>=s.length()){
                break;
            }

            int increase = distance-2*i;

            if(i==nRows-1){
                increase = distance;
            }

            int x = i;
            while(x<s.length()){
                sb.append(s.charAt(x));
                x = x + increase;
                if(increase!=distance){
                    increase=distance-increase;
                }
            }
        }
        System.out.println(sb);
        return sb.toString();
    }
}

public class Solution {
    public String convert(String s, int numRows) {
        //edge case
        if(numRows==1){
            return s;
        }

        // number of char included in each group
        int numberInGroup = 2*(numRows-1);
        // the index of the mid number of the group
        // (actually is the numRows' element in the group)
        int midInGroup = numRows-1;

        StringBuilder[] builder = new StringBuilder[numRows];

        // create builders
        for(int i=0;i<numRows;i++){
            builder[i] = new StringBuilder();
        }

        for(int i=0;i<s.length();i++){
            int innerIndex = i%numberInGroup;
            //calculate the distance between the current char and mid char.
            builder[midInGroup - Math.abs(innerIndex-midInGroup)].append(s.charAt(i));
        }
        String str ="";
        for(int i=0;i<numRows;i++){
            str += builder[i].toString();
        }
        return str;
    }
}
