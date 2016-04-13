/*
    https://leetcode.com/problems/subsets/

    Given a set of distinct integers, nums, return all possible subsets.

    Note:
    Elements in a subset must be in non-descending order.
    The solution set must not contain duplicate subsets.
    For example,
    If nums = [1,2,3], a solution is:

    [
      [3],
      [1],
      [2],
      [1,2,3],
      [1,3],
      [2,3],
      [1,2],
      []
    ]

    @tags: Array, Backtracking, Bit Manipulation
*/

public class P078_Subsets{
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if(nums==null){
            return null;
        }
        Arrays.sort(nums);
        for(int i = 0;i<(1<<nums.length);i++){
            List<Integer> subset = new LinkedList<Integer>();
            for(int j = 0; j<nums.length;j++){
                boolean have = (i&(1<<j))>0;
                if(have){
                    subset.add(nums[j]);
                }
            }
            result.add(subset);
        }
        return result;
    }
}
