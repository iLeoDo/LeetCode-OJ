/*
	https://leetcode.com/problems/search-in-rotated-sorted-array-ii/

	Follow up for "Search in Rotated Sorted Array":
	What if duplicates are allowed?

	Would this affect the run-time complexity? How and why?

	Write a function to determine if a given target is in the array.

	@tags: Array, Binary Search
*/

public class P081_SearchInRotatedSortedArrayII{
	public boolean search(int[] nums, int target) {
        int low =0, high = nums.length-1;

		while(low<=high){
            int mid = (low+high)/2;
            int lowVal = nums[low];
            int highVal = nums[high];
            int midVal = nums[mid];
            if(midVal==target){
                return true;
            }


            // left part is sorted
            if(highVal<midVal){
                if(midVal>target&&lowVal<=target){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }

            // right part is sorted
            else if(midVal<highVal){
                if(midVal<target&&highVal>=target){
                    low = mid+1;
                }else{
                    high = mid-1;

                }
            }
            // midVal == highVal
            else{
                high--;
            }

        }
        return false;
    }
}
