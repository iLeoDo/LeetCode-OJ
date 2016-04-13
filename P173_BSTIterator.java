/*
    https://leetcode.com/problems/binary-search-tree-iterator/

    Implement an iterator over a binary search tree (BST). Your iterator will be 
    initialized with the root node of a BST.

    Calling next() will return the next smallest number in the BST.

    Note: next() and hasNext() should run in average O(1) time and uses O(h) 
    memory, where h is the height of the tree.

    @tags: Tree, Stack, Design
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

public class P173_BSTIterator {

    private Stack<TreeNode> stack = new Stack<TreeNode>();
    private TreeNode current;

    public P173_BSTIterator(TreeNode root) {
        current = root;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(current==null&&stack.empty()){
            return false;
        }else{
            while(current!=null){
                stack.push(current);
                current = current.left;
            }
            return true;
        }
    }

    /** @return the next smallest number */
    public int next() {
        if(hasNext()){
            current = stack.pop();
            int result = current.val;
            current = current.right;
            return result;
        }else{
            return Integer.MAX_VALUE;
        }
    }

}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
