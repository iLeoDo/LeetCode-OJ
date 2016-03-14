
public class P216_CombinationSumIII{
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList();
        combinationSum3Helper(result,new ArrayList<Integer>(),k,1,n);
        return result;
    }

    public void combinationSum3Helper(
                List<List<Integer>> result,
                List<Integer> current,
                int k, int startIndex, int n){
        if(k==0&&n==0){
            result.add(new ArrayList<Integer>(current));
        }else{
            for(int i=startIndex;i<=9 && i<=n;i++){
                current.add(i);
                combinationSum3Helper(result,current,k-1,i+1,n-i);
                current.remove(current.size()-1);
            }
        }
    }
}
