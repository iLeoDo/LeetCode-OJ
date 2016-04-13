/*
    https://leetcode.com/problems/rotate-array/

    Rotate an array of n elements to the right by k steps.

    For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to 
    [5,6,7,1,2,3,4].

    Note:
    Try to come up as many solutions as you can, there are at least 3 different 
    ways to solve this problem.

    Hint:
    Could you do it in-place with O(1) extra space?
    Related problem: Reverse Words in a String II

    @tags: Array
*/

public class P189_RotateArray{
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        // 1,2,3,4,5
        inverse(nums,0,n-1);
        // 5,4,3,2,1
        inverse(nums,0,k-1);
        // 4,5,3,2,1
        inverse(nums,k,n-1);
        // 4,5,1,2,3
    }
    private void inverse(int[]nums, int start, int end){
        while(start<end){
            nums[start] = nums[start]+nums[end];
            nums[end] = nums[start]-nums[end];
            nums[start] = nums[start]-nums[end];
            start++;end--;
        }
    }
}
