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
	public List<List<Integer>> subsets(int[] S) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if(S==null){
            return null;
        }
        
        Arrays.sort(S);
        
        int size = S.length;
        for(int i = 0;i<(1<<size);i++){
            List<Integer> subset = new LinkedList<Integer>();
            for(int j=0;j<size;j++){
                int have = (i&(1<<j));
                if(have !=0){
                    subset.add(S[j]);
                }
            }
            result.add(subset);    
        }
        
        return result;
    }
}
