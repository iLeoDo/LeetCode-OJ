
public class P113_PathSumII{
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new LinkedList();
        pathSumHelper(result, new ArrayList<Integer>(),root,sum);

        return result;
    }

    public void pathSumHelper(List<List<Integer>> result, List<Integer> current, TreeNode root, int sum){
        if(root==null){
            return;
        }
        current.add(root.val);
        if(root.left==null&&root.right==null&&root.val==sum){
            result.add(new ArrayList<Integer>(current));
        }else{
            pathSumHelper(result,current,root.left,sum-root.val);
            pathSumHelper(result,current,root.right,sum-root.val);
        }
        current.remove(current.size()-1);
    }
}
