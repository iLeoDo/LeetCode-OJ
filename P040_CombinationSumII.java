
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
