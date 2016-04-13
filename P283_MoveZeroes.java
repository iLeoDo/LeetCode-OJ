/*
    https://leetcode.com/problems/move-zeroes/

    Given an array nums, write a function to move all 0's to the end of it 
    while maintaining the relative order of the non-zero elements.

    For example, given nums = [0, 1, 0, 3, 12], after calling your function, 
    nums should be [1, 3, 12, 0, 0].

    Note:
    You must do this in-place without making a copy of the array.
    Minimize the total number of operations.

    @tags: Array, Two Pointers
*/

public class P283_MoveZeroes{
    public void moveZeroes(int[] nums) {
        int counter = 0;
        int i;
        for(i = 0;i<nums.length;i++){
            if(nums[i]==0){
                counter++;
            }else{
                nums[i-counter] = nums[i];
            }
        }
        i--;
        while(i>nums.length-counter-1){
            nums[i--]=0;
        }
    }
}
