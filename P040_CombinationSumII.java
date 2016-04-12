/*
    https://leetcode.com/problems/combination-sum-ii/

    Given a collection of candidate numbers (C) and a target number (T), find 
    all unique combinations in C where the candidate numbers sums to T.

    Each number in C may only be used once in the combination.

    Note:
    All numbers (including target) will be positive integers.
    Elements in a combination (a1, a2, … , ak) must be in non-descending order. 
    (ie, a1 ≤ a2 ≤ … ≤ ak).
    The solution set must not contain duplicate combinations.
    For example, given candidate set 10,1,2,7,6,1,5 and target 8, 
    A solution set is: 
    [1, 7] 
    [1, 2, 5] 
    [2, 6] 
    [1, 1, 6] 

    @tags: Array, Backtracking
*/

public class P040_CombinationSumII{
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        combinationSum2Helper(result,new ArrayList<Integer>(), candidates,0,target);
        return result;
    }

    private void combinationSum2Helper(
                List<List<Integer>> result,
                List<Integer> currentSolution,
                int[] candidates,
                int startIndex,
                int target){
        if(target==0){
            result.add(currentSolution);
        }else{
            for(int i=startIndex;i<candidates.length;i++){
                // select the candidate only once per ** sub solution **
                if (i > startIndex && candidates[i] == candidates[i-1]) continue;
                int newTarget = target - candidates[i];
                if(newTarget>=0){
                    List<Integer> copy = new ArrayList<Integer>(currentSolution);
                    copy.add(candidates[i]);
                    combinationSum2Helper(result,copy,candidates,i+1,newTarget);
                }else{
                    break;
                }
            }
        }
    }
}
