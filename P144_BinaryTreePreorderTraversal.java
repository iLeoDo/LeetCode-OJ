/*
    https://leetcode.com/problems/binary-tree-preorder-traversal/

    Given a binary tree, return the preorder traversal of its nodes' values.

    For example:
    Given binary tree {1,#,2,3},
       1
        \
         2
        /
       3
    return [1,2,3].

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

public class P144_BinaryTreePreorderTraversal {
    /**
     * Iteratively
     */
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

    /**
     * Recursive
     */
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


