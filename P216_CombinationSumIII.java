/*
    https://leetcode.com/problems/combination-sum-iii/

    Find all possible combinations of k numbers that add up to a number n, given 
    that only numbers from 1 to 9 can be used and each combination should be a 
    unique set of numbers.

    Ensure that numbers within the set are sorted in ascending order.


    Example 1:

    Input: k = 3, n = 7

    Output:

    [[1,2,4]]

    Example 2:

    Input: k = 3, n = 9

    Output:

    [[1,2,6], [1,3,5], [2,3,4]]

    @tags: Array, Backtracking
*/

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
