/*
    https://leetcode.com/problems/find-peak-element/

    A peak element is an element that is greater than its neighbors.

    Given an input array where num[i] ≠ num[i+1], find a peak element and
    return its index.

    The array may contain multiple peaks, in that case return the index to any
    one of the peaks is fine.

    You may imagine that num[-1] = num[n] = -∞.

    For example, in array [1, 2, 3, 1], 3 is a peak element and your function
    should return the index number 2.

    Note:
    Your solution should be in logarithmic complexity.

    @tags: Array, Binary Search
*/

public class P162_FindPeakElement {
    public int findPeakElement(int[] nums) {
        int low =0, high = nums.length-1;
        while(low<high){
            if(low+1==high){
                //only two left;
                return nums[low]>nums[high] ? low:high;
            }
            int mid = (low+high)>>1;
            if(nums[mid]>nums[mid+1]&&nums[mid]>nums[mid-1]){
                return mid;
            }else if(nums[mid-1]<nums[mid]&&nums[mid]<nums[mid+1]){
                //RHS
                low = mid+1;
            }else{
                //nums[mid-1]>nums[mid]&&nums[mid]>nums[mid+1]
                //LHS
                high = mid-1;
            }
        }
        return low;
    }
}
