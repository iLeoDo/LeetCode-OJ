/*
    https://leetcode.com/problems/majority-element/

    Given an array of size n, find the majority element. The majority element is 
    the element that appears more than ⌊ n/2 ⌋ times.

    You may assume that the array is non-empty and the majority element always 
    exist in the array.

    @tags: Divide and Conquer, Array, Bit Manipulation
*/

public class P169_MajorityElement{
    public int majorityElement(int[] nums) {
        int current = 0;
        int count = 0;
        for(int num : nums){
            if(count == 0){
                current = num;
                count++;
            }else if(current==num){
                count++;
            }else{
                count--;
            }
        }
        return current;
    }
}
