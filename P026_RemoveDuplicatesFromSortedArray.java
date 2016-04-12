/*
    https://leetcode.com/problems/remove-duplicates-from-sorted-array/

    Given a sorted array, remove the duplicates in place such that each element 
    appear only once and return the new length.

    Do not allocate extra space for another array, you must do this in place 
    with constant memory.

    For example,
    Given input array nums = [1,1,2],

    Your function should return length = 2, with the first two elements of nums 
    being 1 and 2 respectively. It doesn't matter what you leave beyond the new 
    length.

    @tags: Array, Two Pointers
*/

public class P026_RemoveDuplicatesFromSortedArray{
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int counter = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                counter++;
            }
            nums[i-counter] = nums[i];
        }
        return nums.length-counter;
    }
}
