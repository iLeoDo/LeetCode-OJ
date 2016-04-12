/*
    https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

    Follow up for "Remove Duplicates":
    What if duplicates are allowed at most twice?

    For example,
    Given sorted array nums = [1,1,1,2,2,3],

    Your function should return length = 5, with the first five elements of 
    nums being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond the 
    new length.

    @tags: Array, Two Pointers
*/

public class P080_RemoveDuplicatesFromSortedArrayII{
    public int removeDuplicates(int[] nums) {

        final int k = 3;

        if(nums.length==0){
            return 0;
        }

        int current = 1;
        int counter = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                counter++;
                if(counter<k){
                    nums[current] = nums[i];
                    current++;
                }
            }else{
                counter = 1;
                nums[current] = nums[i];
                current++;
            }

        }

        return current;
    }
}
