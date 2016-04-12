/*
    https://leetcode.com/problems/binary-tree-inorder-traversal/

    Given a binary tree, return the inorder traversal of its nodes' values.

    For example:
    Given binary tree {1,#,2,3},
       1
        \
         2
        /
       3
    return [1,3,2].

    Note: Recursive solution is trivial, could you do it iteratively?

    --------------------------------
    OJ's Binary Tree Serialization:
    The serialization of a binary tree follows a level order traversal, where 
    '#' signifies a path terminator where no node exists below.

    Here's an example:
       1
      / \
     2   3
        /
       4
        \
         5
    The above binary tree is serialized as "{1,2,3,#,#,4,#,#,5}".

    @tags: Hash Table, Tree, Stack
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
import java.util.*;
public class P094_BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> traversal = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root;
        while(current!=null||!stack.empty()){
            while(current!=null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            traversal.add(current.val);
            current = current.right;
        }
        return traversal;
    }
}
