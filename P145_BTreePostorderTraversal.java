/*
    https://leetcode.com/problems/binary-tree-postorder-traversal/

    Given a binary tree, return the postorder traversal of its nodes' values.

    For example:
    Given binary tree {1,#,2,3},
       1
        \
         2
        /
       3
    return [3,2,1].

    Note: Recursive solution is trivial, could you do it iteratively?

    @tags: Tree, Stack
*/

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class P145_BTreePostorderTraversal{
	public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> traversal = new LinkedList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Stack<Integer> timeTracker = new Stack<Integer>();

        TreeNode current = root;
        int time;
        while(current!=null||!stack.empty()){
            while(current!=null){
                stack.push(current);
                timeTracker.push(1);
                current = current.left;
            }

            current = stack.pop();
            time = timeTracker.pop();
            if(time==1){
                stack.push(current);
                timeTracker.push(2);
                current = current.right;
            }else if(time==2){
                traversal.add(current.val);
                current = null;
            }
        }
        return traversal;

    }
}
