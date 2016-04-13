/*
    https://leetcode.com/problems/largest-number/

    Given a list of non negative integers, arrange them such that they form the
    largest number.

    For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.

    Note: The result may be very large, so you need to return a string instead
    of an integer.

    @tags: Sort
*/

public class P179_LargestNumber{
	public String largestNumber(int[] nums) {
        String[] eles = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            eles[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(eles,new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                return (a+b).compareTo(b+a);
            }
        });
        StringBuilder sb = new StringBuilder();
        boolean leadingZero = true;
        for(int i=eles.length-1;i>=0;i--){
            if(leadingZero&&eles[i].equals("0")){
                return "0";
            }else{
                sb.append(eles[i]);
                leadingZero = false;
            }
        }
        return sb.toString();
    }
}
