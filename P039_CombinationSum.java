/*
    https://leetcode.com/problems/combination-sum/

    Given a set of candidate numbers (C) and a target number (T), find all 
    unique combinations in C where the candidate numbers sums to T.

    The same repeated number may be chosen from C unlimited number of times.

    Note:
    All numbers (including target) will be positive integers.
    Elements in a combination (a1, a2, … , ak) must be in non-descending order. 
    (ie, a1 ≤ a2 ≤ … ≤ ak).
    The solution set must not contain duplicate combinations.
    For example, given candidate set 2,3,6,7 and target 7, 
    A solution set is: 
    [7] 
    [2, 2, 3] 

    @tags: Array, Backtracking
*/

public class P039_CombinationSum{
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        // firstly sort and deduplicate
        Arrays.sort(candidates);
        combinationSumHelper(result,candidates, 0, new ArrayList<Integer>(), target);
        return result;

    }

    private void combinationSumHelper(
                                List<List<Integer>> result,
                                int[] candidates,
                                int startIndex,
                                List<Integer> currentSolution,
                                int target){
        if(target==0){
            result.add(currentSolution);
        }else{
            for(int i = startIndex;i<candidates.length;i++){
                int newTarget = target-candidates[i];
                if(newTarget<0){
                    break;
                }else{
                    List<Integer> copy = new ArrayList<Integer>(currentSolution);
                    copy.add(candidates[i]);
                    combinationSumHelper(result,candidates,i,copy,target-candidates[i]);
                }
            }
        }
    }
}
