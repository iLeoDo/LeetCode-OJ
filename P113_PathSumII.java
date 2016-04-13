/*
    https://leetcode.com/problems/path-sum-ii/

    Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

    For example:
    Given the below binary tree and sum = 22,
                  5
                 / \
                4   8
               /   / \
              11  13  4
             /  \    / \
            7    2  5   1
    return
    [
       [5,4,11,2],
       [5,8,4,5]
    ]

    @tags: Tree, Depth-first Search
*/

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
