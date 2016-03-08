/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/**
 * Iteratively
 */
public class P144_BTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> traversal = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root;
        while(current!=null||!stack.empty()){
            while(current!=null){
                traversal.add(current.val);
                stack.push(current);
                current = current.left;
            }
            current = stack.pop().right;
        }
        return traversal;
    }
}
/**
 * Recursive
 */
public class P144_BTreePreorderTraversal {
    public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> traversal = new ArrayList<Integer>();
        if(root==null){
            return traversal;
        }else{
            traversal.add(root.val);
            traversal.addAll(preorderTraversal(root.left));
            traversal.addAll(preorderTraversal(root.right));
            return traversal;
        }
    }
}
}

