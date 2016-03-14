
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
