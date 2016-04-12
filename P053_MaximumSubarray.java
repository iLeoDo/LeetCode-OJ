/*
    https://leetcode.com/problems/maximum-subarray/

    Find the contiguous subarray within an array (containing at least one 
    number) which has the largest sum.

    For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
    the contiguous subarray [4,−1,2,1] has the largest sum = 6.

    --------------------------------
    More practice:
    If you have figured out the O(n) solution, try coding another solution using 
    the divide and conquer approach, which is more subtle.

    @tags: Divide and Conquer, Array, Dynamic Programming
*/

public class P053_MaximumSubarray{
    public int maxSubArray(int[] nums) {
        int maxSumEndingHere = nums[0];
        int maxSumSoFar = nums[0];
        for(int i=1;i<nums.length;i++){
            maxSumEndingHere = Math.max(nums[i], maxSumEndingHere+nums[i]);
            maxSumSoFar = Math.max(maxSumEndingHere,maxSumSoFar);
        }
        return maxSumSoFar;
    }

    /**
     * Divide and Conquer: https://leetcode.com/discuss/60435/c-an-clear-o-n-divide-and-conquer-solution-with-comments
     */

    /*
    For each subarray, calculate four attributes:

    mx (largest sum of this subarray),
    lmx(largest sum starting from the left most element),
    rmx(largest sum ending with the right most element),
    sum(the sum of the total subarray).
    The recurrence is: T(n) = 2T(n / 2) + O(1). So the running time of this algorithm is O(n).

    class Solution {
    public:
        void maxSubArray(vector<int>& nums, int l, int r, int& mx, int& lmx, int& rmx, int& sum) {
            if (l == r) {
                mx = lmx = rmx = sum = nums[l];
            }
            else {
                int m = (l + r) / 2;
                int mx1, lmx1, rmx1, sum1;
                int mx2, lmx2, rmx2, sum2;
                maxSubArray(nums, l, m, mx1, lmx1, rmx1, sum1);
                maxSubArray(nums, m + 1, r, mx2, lmx2, rmx2, sum2);
                mx = max(max(mx1, mx2), rmx1 + lmx2);
                lmx = max(lmx1, sum1 + lmx2);
                rmx = max(rmx2, sum2 + rmx1);
                sum = sum1 + sum2;
            }
        }
        int maxSubArray(vector<int>& nums) {
            if (nums.size() == 0) {
                return 0;
            }
            int mx, lmx, rmx, sum;
            maxSubArray(nums, 0, nums.size() - 1, mx, lmx, rmx, sum);
            return mx;
        }
    };

    */
}
